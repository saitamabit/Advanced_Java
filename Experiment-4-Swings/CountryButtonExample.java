/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).
*/

package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label to show message
        JLabel label = new JLabel("Press a button");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create buttons
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        // Add ActionListeners
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Set frame visible
        frame.setVisible(true);
    }
}
