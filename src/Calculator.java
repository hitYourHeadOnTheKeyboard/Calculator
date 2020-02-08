import view.WindowGUI;

import javax.swing.*;

/**
 * Эта программа представляет собой стандартную реализацию
 * калькулятора с графическим интерфейсом.
 * @author Serg aka hitYourHeadOnTheKeyboard
 * @version 1.0
 */

public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WindowGUI windowGui = new WindowGUI();
                windowGui.setResizable(false);
                windowGui.setVisible(true);
            }
        });

    }
}
