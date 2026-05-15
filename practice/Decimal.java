package com.mycompany.practice;

public class Decimal {

    public static String decimalToBinary(int number) {

        String result = "";
        int step = 1;

        System.out.println("------------------------------");
        while (number > 0) {
            int remainder = number % 2;
            int quotient = number / 2;
            System.out.printf("Step %d: %d / 2 = %d remainder: %d%n",
                    step,
                    number,
                    quotient,
                    remainder);
            result = remainder + result;
            number = quotient;
            step++;
        }
        System.out.printf("Result: %s%n", result);
        return result;
    }

    public static String decimalToOctal(int number) {

        String result = "";
        int step = 1;

        System.out.println("------------------------------");
        while (number > 0) {
            int remainder = number % 8;
            int quotient = number / 8;
            System.out.printf("Step %d: %d / 8 = %d remainder: %d%n",
                    step,
                    number,
                    quotient,
                    remainder);
            result = remainder + result;
            number = quotient;
            step++;
        }
        System.out.printf("Result: %s%n", result);
        return result;
    }

    public static String decimalToHexadecimal(int number) {

        String result = "";
        final char[] hexSymbol = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B',
            'C', 'D', 'E', 'F'};
        int step = 1;

        System.out.println("------------------------------");
        while (number > 0) {
            int remainder = number % 16;
            int quotient = number / 16;
            System.out.printf("Step %d: %d / 16 = %d remainder: %d - %c%n",
                    step,
                    number,
                    quotient,
                    remainder,
                    hexSymbol[remainder]);
            result = hexSymbol[remainder] + result;
            number = quotient;
            step++;
        }
        System.out.printf("Result: %s%n", result);
        return result;
    }
}