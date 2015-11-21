// Required JavaMail imports


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

    /**
     * Due to the work being done in the constructor,
     * and an possibly unwieldy amount of parameters, the
     * mailer will be initialized with a builder pattern.
     */
    public static class Builder{

        //TODO
        // Need to add default values for developer
        // and allow for specific parameters to be specified

        // Parameters
        private String receiverID;
        private String senderID;
        private String username;
        private String password;

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
    }

    public void generateEmail(){
        // Host we are sending email through
        //TODO
        String host = "";

//         Properties props = new Properties();
//         props.put("mail.smtp.auth", "true");
//         props.put("mail.smtp.starttls.enable", "true");
//         props.put("mail.smtp.host", host);
//         props.put("mail.smtp.port", "25");
//
//         Get the Session object.
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            // Create a default MimeMessage object.
//            Message message = new MimeMessage(session);
//
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//
//            // Set To: header field of the header.
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse(to));
//
//            // Set Subject: header field
//            message.setSubject("Testing Subject");
//
//            // Create the message part
//            BodyPart messageBodyPart = new MimeBodyPart();
//
//            // Now set the actual message
//            messageBodyPart.setText("This is message body");
//
//            // Create a multipar message
//            Multipart multipart = new MimeMultipart();
//
//            // Set text message part
//            multipart.addBodyPart(messageBodyPart);
//
//            // Part two is attachment
//            messageBodyPart = new MimeBodyPart();
//            String filename = "/home/manisha/file.txt";
//            DataSource source = new FileDataSource(filename);
//            messageBodyPart.setDataHandler(new DataHandler(source));
//            messageBodyPart.setFileName(filename);
//            multipart.addBodyPart(messageBodyPart);
//
//            // Send the complete message parts
//            message.setContent(multipart);
//
//            // Send message
//            Transport.send(message);
//
//            System.out.println("Sent message successfully....");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
    }
}
