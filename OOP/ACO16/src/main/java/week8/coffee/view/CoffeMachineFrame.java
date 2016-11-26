package week8.coffee.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by gorobec on 26.11.16.
 */
public class CoffeMachineFrame extends JFrame{

    private JButton putMoney = new JButton("Put money");
    private JButton makeChoice = new JButton("Make choise");
    private JButton makeCoffe = new JButton("Make coffee");
    private JButton giveCharge = new JButton("Cancel");
    private JTextArea textArea = new JTextArea(5, 30);
    private JScrollPane scrollPane = new JScrollPane();

    public CoffeMachineFrame() throws HeadlessException {

        setLayout(new GridBagLayout());
        setSize(new Dimension(600, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coffee machine");
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(15, 15, 15, 15);
        constraints.fill = GridBagConstraints.BOTH;

        scrollPane.add(textArea);

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(putMoney, constraints);
        constraints.gridy = 1;
        add(makeChoice, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(makeCoffe, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(giveCharge, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        add(scrollPane, constraints);
        pack();
    }


    public void addPutMoneyListener(ActionListener listener){
        putMoney.addActionListener(listener);
    }

    public void addMakeChoiceListener(ActionListener listener){
        makeChoice.addActionListener(listener);
    }
    public void addMakeCoffeeListener(ActionListener listener){
        makeCoffe.addActionListener(listener);
    }
    public void addGiveChargeListener(ActionListener listener){
        giveCharge.addActionListener(listener);
    }
}
