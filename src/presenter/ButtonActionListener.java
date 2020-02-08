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
    Arithmetic arithmetic = new Arithmetic();
    JTextField textField = WindowGUI.textField;
    String temp = "";
    String operator = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        String fieldValue = textField.getText();

        switch (e.getActionCommand()) {
            case "+":
                if (temp.equals("")) {
                    temp = fieldValue;
                    operator = "+";
                    textField.setText("");
                } else {
                    temp = arithmetic.add(temp, fieldValue);
                    textField.setText(temp);
                }
                break;
            case "-":
                if (temp.equals("")) {
                    temp = fieldValue;
                    operator = "-";
                    textField.setText("");
                } else {
                    temp = arithmetic.subtract(temp, fieldValue);
                    textField.setText(temp);
                }
                break;
            case "*":
                if (temp.equals("")) {
                    temp = fieldValue;
                    operator = "*";
                    textField.setText("");
                } else {
                    temp = arithmetic.multiplyBy(temp, fieldValue);
                    textField.setText(temp);
                }
                break;
            case "/":
                if (temp.equals("")) {
                    temp = fieldValue;
                    operator = "/";
                    textField.setText("");
                } else {
                    temp = arithmetic.divideBy(temp, fieldValue);
                    textField.setText(temp);
                }
                break;
            case "%":
                if (temp.equals("")) {
                    temp = fieldValue;
                    operator = "%";
                    textField.setText("");
                } else {
                    temp = arithmetic.percent(temp, fieldValue);
                    textField.setText(temp);
                }
                break;
            case "=":
                if (operator.equals("+")) {
                    temp = arithmetic.add(temp, fieldValue);
                    textField.setText(temp);
                }else if (operator.equals("-")) {
                    temp = arithmetic.subtract(temp, fieldValue);
                    textField.setText(temp);
                }else if (operator.equals("*")) {
                    temp = arithmetic.multiplyBy(temp, fieldValue);
                    textField.setText(temp);
                }else if (operator.equals("/")) {
                    temp = arithmetic.divideBy(temp, fieldValue);
                    textField.setText(temp);
                }else if (operator.equals("%")) {
                    temp = arithmetic.percent(temp, fieldValue);
                    textField.setText(temp);
                }
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
                if (!fieldValue.equals(""))
                    textField.setText(fieldValue.substring(0, fieldValue.length()-1));
                break;
            case "C":
                temp = "";
                operator = "";
                textField.setText("");
                break;
            case ".":
                if (!fieldValue.contains("."))
                    textField.setText(fieldValue + ".");
                break;
            case "0":
                textField.setText(fieldValue + "0");
                break;
            case "1":
                textField.setText(fieldValue + "1");
                break;
            case "2":
                textField.setText(fieldValue + "2");
                break;
            case "3":
                textField.setText(fieldValue + "3");
                break;
            case "4":
                textField.setText(fieldValue + "4");
                break;
            case "5":
                textField.setText(fieldValue + "5");
                break;
            case "6":
                textField.setText(fieldValue + "6");
                break;
            case "7":
                textField.setText(fieldValue + "7");
                break;
            case "8":
                textField.setText(fieldValue + "8");
                break;
            case "9":
                textField.setText(fieldValue + "9");
                break;
        }
    }
}


