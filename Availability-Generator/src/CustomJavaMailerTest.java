import org.junit.Test;

/**
 * @author Steven Gantz
 */
public class CustomJavaMailerTest {

    @Test
    public void testBuild() throws Exception {
        CustomJavaMailer customJavaMailer = new
                CustomJavaMailer.Builder()
                .receiverID("Test1")
                .senderID("Test2")
                .username("Test3")
                .password("Test4")
                .build();
        customJavaMailer.generateEmail();
    }
}