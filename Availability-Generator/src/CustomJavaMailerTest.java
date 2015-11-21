import org.junit.Test;

import java.io.FileOutputStream;

/**
 * @author Steven Gantz
 */
public class CustomJavaMailerTest {

    @Test
    public void testBuild() throws Exception {
        // Generate small binary file to test
        byte dataToWrite[] = "BinaryTest".getBytes();
        FileOutputStream out = new FileOutputStream("TestFile.bin");
        out.write(dataToWrite);
        out.close();

        // TODO - look into having user enter their own username and password to send
        // Test actual mailer
        CustomJavaMailer customJavaMailer = new
                CustomJavaMailer.Builder()
                .receiverID("AvailabilityGen@gmail.com")
                .senderID("AvailabilityGen@gmail.com")
                .username("availabilitygen@gmail.com")
                .password("firef0x1")
                .fileName("TestFile.bin")
                .build();
        customJavaMailer.generateEmail();
        customJavaMailer.sendEmail();
    }
}