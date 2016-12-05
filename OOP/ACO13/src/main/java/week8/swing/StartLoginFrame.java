package week8.swing;

import javax.swing.*;

/**
 * Created by gorobec on 16.07.16.
 */
public class StartLoginFrame {
    public static void main(String[] args) throws InterruptedException {
//        new LoginFrame();
        JFrame main = new MainFrame();
        JProgressBar bar = new JProgressBar();
        bar.setStringPainted(true);
        bar.setMinimum(0);
        bar.setMaximum(100);
        bar.setToolTipText("This is bar");
        main.add(bar);
        main.pack();
        for (int i = 0; i <= bar.getMaximum(); i++) {
            Thread.sleep(50);
            bar.setValue(i);
            System.out.println(bar.getValue());
        };
    }
}
