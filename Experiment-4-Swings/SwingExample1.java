/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package Swings;

import javax.swing.*;
import java.awt.*;

public class SwingExample1 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Welcome Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI A, Welcome to Swing Programming");

        // Set font to plain and size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
