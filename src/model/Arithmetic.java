package model;

/**
 * Класс с логикой арифметических действий.
 */

public class Arithmetic {
    public static boolean isInt(double d) {
        return d == (int) d;
    }

    public String add(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double result = x + y;
        return isInt(result)? "" + (int) result : "" + result;
    }

    public String subtract(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double result = x - y;
        return isInt(result)? "" + (int) result : "" + result;
    }

    public String multiplyBy(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double result = x * y;
        return isInt(result)? "" + (int) result : "" + result;
    }

    public String divideBy(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double result = x / y;
        return isInt(result)? "" + (int) result : "" + result;
    }


    public String percent(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double result = (x*y)/100;
        return isInt(result)? "" + (int) result : "" + result;
    }

}
