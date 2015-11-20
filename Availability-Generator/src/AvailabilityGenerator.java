/**
 * Created by Ryan Harrington on 11/19/2015.
 */
import javax.swing.*;

public class AvailabilityGenerator {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Availability Generator");
        frame.getContentPane().add(label);
        frame.setSize(1366,768);

        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        createAndShowGUI();
    }
}
