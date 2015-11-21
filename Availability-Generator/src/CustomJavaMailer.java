// Required JavaMail imports

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

/**
 * @author Steven Gantz
 * @version 1.0 -
 * This class is designed to
 * send an email from a default
 * email address stored within
 * Availability Generator.
 */
public class CustomJavaMailer {

    // Class attributes
    private String receiverID;
    private String senderID;
    private String username;
    private String password;
    private String filename;

    // Attribute to hold globally for manual sending
    private Message message;

    /**
     * Due to the work being done in the constructor,
     * and an possibly unwieldy amount of parameters, the
     * mailer will be initialized with a builder pattern.
     */
    public static class Builder{

        // Parameters
        private String receiverID;
        private String senderID;
        private String username;
        private String password;
        private String fileName;

        public Builder fileName(String fileName){
            this.fileName = fileName;
            return this;
        }

        public Builder receiverID(String receiverID){
            this.receiverID = receiverID;
            return this;
        }

        public Builder senderID(String senderID){
            this.senderID = senderID;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public CustomJavaMailer build(){
            return new CustomJavaMailer(this);
        }
    }

    /**
     * Private constructor uses builder to generate object
     * @param builder contains all necessary values
     */
    private CustomJavaMailer(Builder builder){
        receiverID = builder.receiverID;
        senderID = builder.senderID;
        username = builder.username;
        password = builder.password;
        filename = builder.fileName;
    }

    /**
     * Generate an email object for sending
     */
    public void generateEmail() throws MessagingException{

        // Assign default properties
        Properties props = defaultProperties();

        // Retrieve the session object
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        // Generate actual email
        // Create object and set fields
        this.message = new MimeMessage(session);
        message.setFrom(new InternetAddress(this.senderID));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(this.receiverID));
        // TODO - Set proper values
        message.setSubject("Availability Generator Subject Test");

        // Create body of message
        BodyPart messageBodyPart = new MimeBodyPart();
        // TODO - set proper value
        messageBodyPart.setText("Availability Generator Text Test");

        // Format message for attachment
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        // - Reuse messageBodyPart
        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(this.filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Complete message creation
        message.setContent(multipart);
    }

    public void sendEmail() throws MessagingException{
        Transport.send(message);
    }

    /**
     * Create and return a default properties object
     * @return Custom properties object
     */
    public Properties defaultProperties(){
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        return properties;
    }
}
