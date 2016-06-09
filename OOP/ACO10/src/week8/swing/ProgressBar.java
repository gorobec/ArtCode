package week8.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gorobec on 30.01.16.
 */
public class ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setTitle("Main frame");
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        frame.add(progressBar);
        frame.pack();
        for (int i = progressBar.getMinimum(); i <= progressBar.getMaximum(); i++) {
            Thread.sleep(500);
            progressBar.setValue(i);
        }
    }
}
