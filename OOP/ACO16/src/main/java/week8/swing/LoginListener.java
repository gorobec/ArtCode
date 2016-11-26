package week8.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorobec on 26.11.16.
 */
public class LoginListener implements ActionListener {


    private JTextField loginField;
    private JPasswordField passField;

    private String login = "admin";
    private String pass = "admin";

    public LoginListener(JTextField loginField, JPasswordField passField) {
        this.loginField = loginField;
        this.passField = passField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (login.equals(loginField.getText()) &&
                pass.equals(passField.getText())){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong login or pass");
        }
    }
}
