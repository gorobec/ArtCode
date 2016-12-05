package week8.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gorobec on 16.07.16.
 */
public class MainFrame extends JFrame {



    public MainFrame() throws InterruptedException {
        setTitle("Main frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(600, 400);
        setLocationRelativeTo(null);

        setVisible(true);
        setJMenuBar(new MenuBar());


    }
}
