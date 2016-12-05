package week8.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gorobec on 16.07.16.
 */
public class _02layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("My frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JPanel pane2 = new JPanel();
        pane2.setBackground(Color.YELLOW);
        JPanel pane3 = new JPanel();
        pane3.setBackground(Color.MAGENTA);
        JPanel pane4 = new JPanel();
        pane4.setBackground(Color.GREEN);
        JPanel pane5 = new JPanel();
        pane5.setBackground(Color.RED);


        frame.add(panel, BorderLayout.CENTER);
        frame.add(pane2, BorderLayout.NORTH);
        frame.add(pane3, BorderLayout.SOUTH);
        frame.add(pane4, BorderLayout.WEST);
        frame.add(pane5, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
