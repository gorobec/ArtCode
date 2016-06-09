package week8.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by gorobec on 30.01.16.
 */
public class Actions {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login frame");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        frame.add(panel, BorderLayout.CENTER);
        JLabel label = new JLabel("Login");
        JTextField loginField = new JTextField(10);
        JButton loginButton = new JButton("Login");
        loginField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    System.out.println(loginField.getText());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                /*if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    System.out.println("released");
                }*/
            }
        });
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JLabel label2 = new JLabel("Password");
        JTextField passField = new JPasswordField(10);
        JButton cancelButton = new JButton("Cancel");
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(passField.getText().equals("12345")){
                    System.out.println("User " + loginField.getText() + " successful logged");
                }else {
                    JOptionPane.showMessageDialog(frame,
                            "Wrong login or pass",
                            "Login error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);
        gbc.gridx = 1;
        panel.add(loginField, gbc);
        gbc.gridx = 2;
        panel.add(loginButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(label2, gbc);
        gbc.gridx = 1;
        panel.add(passField, gbc);
        gbc.gridx = 2;
        panel.add(cancelButton, gbc);


        /*panel.add(label2);
        panel.add(passField);
        panel.add(cancelButton)*/;
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();


    }
}
