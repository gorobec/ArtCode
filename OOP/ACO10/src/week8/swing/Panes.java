package week8.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gorobec on 30.01.16.
 */
public class Panes {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Main frame");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.MAGENTA);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(255, 255, 255));
        JButton button = new JButton("text");


        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.setVisible(true);
    }
}
