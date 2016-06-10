package swing;

import javax.swing.*;

public class FirstSwing {
    public FirstSwing() {
        JFrame jFrame = new JFrame("First window");
        jFrame.setSize(300, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Lets fill this window");
        jFrame.add(jLabel);
        jFrame.setVisible(true);
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstSwing();
            }
        });
    }


}
