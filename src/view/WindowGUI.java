package view;

import presenter.ButtonActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * В этом классе создается графический интерфейс пользователя.
 */

public class WindowGUI extends JFrame {
    public static JTextField textField = new JTextField("0");
    private MyButtons myButtons = new MyButtons();
    ButtonActionListener actionListener = new ButtonActionListener();

    public WindowGUI() {
        super("Calculator");
        this.setBounds(250, 150, 222, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputFrame = new JPanel();
        textField.setColumns(20);
        textField.setFont(new Font("monospaced", Font.BOLD, 16));
        textField.setEditable(false);
        inputFrame.add(textField);


        Container buttons = new Container();
        buttons.setLayout(new GridLayout(5, 5, 2, 2));
        for (JButton jb : myButtons.getButtons()) {
            jb.addActionListener(actionListener);
            jb.setFocusable(false);
            buttons.add(jb);
        }

        add(inputFrame, BorderLayout.NORTH);
        add(buttons, BorderLayout.WEST);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                textField.requestFocus();
            }
        });
    }
}

