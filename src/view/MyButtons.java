package view;

import javax.swing.*;

/**
 * Класс для создания набора кнопок
 */

public class MyButtons {
    private String[] buttonsName = new String[]{"0", "1", "2", "3",
                                                "4", "5", "6", "7",
                                                "8", "9", ".", "C",
                                                "*", "/", "-", "+",
                                                "=", "Del", "+/-", "%"};


     public JButton[] getButtons() {
        int buttonsNameArrayLength = buttonsName.length;
        JButton[] buttons = new JButton[buttonsNameArrayLength];
        for (int i = 0; i < buttonsName.length; i++) {
            buttons[i] = new JButton(buttonsName[i]);
        }
        return buttons;
    }
}
