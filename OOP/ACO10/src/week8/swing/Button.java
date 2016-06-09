package week8.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gorobec on 30.01.16.
 */
public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setTitle("Main frame");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel("Login");
        JTextField loginField = new JTextField();
        JButton okButton = new JButton("Login");
        okButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(label);
        frame.add(loginField);
        frame.add(okButton);
    }
}
