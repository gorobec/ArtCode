package week8.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorobec on 16.07.16.
 */
public class LoginFrame extends JFrame{

    private static final String LOGIN = "admin";
    private static final String PASSWORD = "admin";


    public LoginFrame() {
        setTitle("Login frame");

//        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel login = new JLabel("Login");
        JLabel password = new JLabel("Password");

        JTextField loginField = new JTextField(10);
        JTextField passwordField = new JPasswordField(10);

        JButton loginButton = new JButton("Log in");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(loginField.getText().equals(LOGIN) &&
                        passwordField.getText().equals(PASSWORD)){
                    try {
                        new MainFrame();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    LoginFrame.this.dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this,
                            "Wrong login or password.",
                            "Login error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        JButton cancelButton = new JButton("Cancel");

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginField.setText("");
                passwordField.setText("");
            }
        });

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();


        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(login, gbc);
        gbc.gridx = 1;
        add(loginField, gbc);


        gbc.gridy = 1;
        gbc.gridx = 0;
        add(password, gbc);
        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridy = 0;
        gbc.gridx = 2;
        add(loginButton, gbc);
        gbc.gridy = 1;
        add(cancelButton, gbc);
        pack();
        setVisible(true);
    }
}
