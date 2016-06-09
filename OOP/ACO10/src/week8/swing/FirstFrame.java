package week8.swing;


import javax.swing.*;
import java.awt.*;

public class FirstFrame {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setTitle("Main frame");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setState(Frame.ICONIFIED);
        Thread.sleep(1500);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        Thread.sleep(1500);
        frame.setExtendedState(Frame.NORMAL);
    }
}
