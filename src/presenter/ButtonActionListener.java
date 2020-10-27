package presenter;

import model.Arithmetic;
import view.WindowGUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * В этом классе кнопкам присваиваются действия
 * согласно их названию.
 */

public class ButtonActionListener implements ActionListener {
    private final Arithmetic arithmetic = new Arithmetic();
    private JTextField textField = WindowGUI.textField;
    private String temp = "";
    private String operator = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        String fieldValue = textField.getText();

        switch (e.getActionCommand()) {
            case "+":
                performActionFor("+", fieldValue);
                break;
            case "-":
                performActionFor("-", fieldValue);
                break;
            case "*":
                performActionFor("*", fieldValue);
                break;
            case "/":
                performActionFor("/", fieldValue);
                break;
            case "%":
                performActionFor("%", fieldValue);
                break;
            case "=":
                chooseCommand(operator, fieldValue);
                temp = "";
                operator = "";
                break;
            case "+/-":
                if (!fieldValue.equals("0") && !fieldValue.equals("")) {
                    if (fieldValue.startsWith("-")) {
                        temp = fieldValue.substring(1);
                    }else {
                        temp = "-" + fieldValue;
                    }
                    textField.setText(temp);
                }
                temp = "";
                break;
            case "Del":
                if (!fieldValue.equals("") && !fieldValue.equals("0")) {
                    if (fieldValue.length() > 1) {
                        textField.setText(fieldValue.substring(0, fieldValue.length() - 1));
                    }else {
                        textField.setText("0");
                    }
                }
                break;
            case "C":
                temp = "";
                operator = "";
                textField.setText("0");
                break;
            case ".":
                if (!fieldValue.contains(".") && !fieldValue.isEmpty())
                    textField.setText(fieldValue + ".");
                break;
            case "0":
                addDigit("0", fieldValue);
                break;
            case "1":
                addDigit("1", fieldValue);
                break;
            case "2":
                addDigit("2", fieldValue);
                break;
            case "3":
                addDigit("3", fieldValue);
                break;
            case "4":
                addDigit("4", fieldValue);
                break;
            case "5":
                addDigit("5", fieldValue);
                break;
            case "6":
                addDigit("6", fieldValue);
                break;
            case "7":
                addDigit("7", fieldValue);
                break;
            case "8":
                addDigit("8", fieldValue);
                break;
            case "9":
                addDigit("9", fieldValue);
                break;
        }
    }

    private void performActionFor(String command, String fieldValue) {
        if (temp.equals("")) {
            temp = fieldValue;
            operator = command;
            textField.setText("");
        } else {
            chooseCommand(command, fieldValue);
        }
    }

    private void chooseCommand(String operator, String fieldValue) {
        switch (operator) {
            case "+":
                temp = arithmetic.add(temp, fieldValue);
                textField.setText(temp);
                break;
            case "-":
                temp = arithmetic.subtract(temp, fieldValue);
                textField.setText(temp);
                break;
            case "*":
                temp = arithmetic.multiplyBy(temp, fieldValue);
                textField.setText(temp);
                break;
            case "/":
                temp = arithmetic.divideBy(temp, fieldValue);
                textField.setText(temp);
                break;
            case "%":
                temp = arithmetic.percent(temp, fieldValue);
                textField.setText(temp);
                break;
        }
    }

    private void addDigit(String digit, String fieldValue) {
        if (fieldValue.equals("0")) textField.setText(digit);
        else textField.setText(fieldValue + digit);
    }
}