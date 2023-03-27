package at.kaindorf.pattern.state.coffee.gui;

import at.kaindorf.pattern.state.coffee.CoffeeMaker;

import javax.swing.*;

public class CoffeeMachineGUI {
    private JFrame frame;
    private JPanel pnlContent;
    private JLabel lblCurrentStatus;
    private JPanel pnlButtons;
    private JButton btnInsertCoins;
    private JButton btnRemoveCoins;
    private JButton btnEspresso;
    private JButton btnCappucinno;
    private JButton btnFinishCoffee;
    private JButton btnAddCaffeine;
    private JLabel lblMoneyCaffeine;

    public CoffeeMachineGUI() {
        initComponents();
    }

    private void initComponents() {

        frame = new JFrame("CoffeeMachine");
        frame.setContentPane(pnlContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
        lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());

        btnInsertCoins.addActionListener(e -> {
                    coffeeMaker.insertCoins();
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        btnRemoveCoins.addActionListener(e -> {
                    coffeeMaker.removeCoins();
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        btnEspresso.addActionListener(e -> {
                    coffeeMaker.chooseCoffee(100);
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        btnCappucinno.addActionListener(e -> {
                    coffeeMaker.chooseCoffee(150);
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        btnFinishCoffee.addActionListener(e -> {
                    coffeeMaker.finishCoffee();
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        btnAddCaffeine.addActionListener(e -> {
                    coffeeMaker.addCaffeine();
                    lblCurrentStatus.setText(coffeeMaker.getCurrentState().toString());
                    lblMoneyCaffeine.setText(coffeeMaker.getCoinAmount() + " | " + coffeeMaker.getCaffeineAmount());
                }
        );

        frame.pack();
        frame.setVisible(true);
    }

    //Context methods


    public static void main(String[] args) {
        CoffeeMachineGUI coffeeMachine = new CoffeeMachineGUI();
    }
}
