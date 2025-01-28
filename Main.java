package TZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) {
        String result = "";
        try {
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                return "throws Exception";
            }
            String firstNumber = parts[0];
            String operator = parts[1];
            String secondNumber = parts[2];
            int num1 = 0;
            int num2 = 0;
            try {
                num1 = Integer.parseInt(firstNumber);
            } catch (NumberFormatException e) {
                return "throws Exception";
            }
            try {
                num2 = Integer.parseInt(secondNumber);
            } catch (NumberFormatException e) {
                return "throws Exception";
            }
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                return "throws Exception";
            }
            int res = 0;
            if (operator.equals("+")) {
                res = num1 + num2;
            } else if (operator.equals("-")) {
                res = num1 - num2;
            } else if (operator.equals("*")) {
                res = num1 * num2;
            } else if (operator.equals("/")) {
                res = num1 / num2;
            } else {
                return "throws Exception";
            }
            result = Integer.toString(res);
        } catch (Exception e) {
            return "throws Exception";
        }
        return result;
    }
}