package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstButtons {
    JLabel jLabel;
    public FirstButtons() {
        JFrame jFrame = new JFrame("Choise programm");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButtonAlpha = new JButton("Yes");
        JButton jButtonBeta = new JButton("No");

        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Yes was pressed");
            }
        }); jButtonBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("No was pressed");
            }
        });
jFrame.add(jButtonAlpha);
jFrame.add(jButtonBeta);

        jLabel = new JLabel("Make choice!");
        jFrame.add(jLabel);
        jFrame.setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstButtons();
            }
        });
    }
}
