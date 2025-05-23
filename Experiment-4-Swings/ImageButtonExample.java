/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/

package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Label to display result
        JLabel messageLabel = new JLabel("Press an image button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Load images
        ImageIcon digitalClockIcon = new ImageIcon("dd2.png");
        ImageIcon hourGlassIcon = new ImageIcon("hg.png");

        // Create buttons with images
        JButton btnDigitalClock = new JButton(digitalClockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        // Add action listeners
        btnDigitalClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to frame
        frame.add(btnDigitalClock);
        frame.add(btnHourGlass);
        frame.add(messageLabel);

        // Show frame
        frame.setVisible(true);
    }
}

