package com.mycompany.practice;

public class Hexadecimal extends Decimal {

    public static int hexadecimalToDecimal(String hexadecimal) {

        int decimal = 0;
        int power = 0;
        int step = 1;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {

            int digit;

            if (hexadecimal.matches("[0-9]+")) {
                digit = hexadecimal.charAt(i) - '0';
            } else {
                digit = (hexadecimal.charAt(i) - 'A') + 10;
            }

            int value = digit * (int) Math.pow(16, power);
            int total = value;
            System.out.printf("Step %d: %d * 16 ^ %d = %d%n",
                    step,
                    digit,
                    power,
                    value);
            decimal += value;
            step++;
            power++;
        }
        System.out.println("Result: " + decimal);
        return decimal;
    }

    public static String hexadecimalToBinary(String hexadecimal) {

        int decimal = hexadecimalToDecimal(hexadecimal);

        String result = decimalToBinary(decimal);

        return result;
    }

    public static String hexadecimalToOctal(String hexadecimal) {

        int decimal = hexadecimalToDecimal(hexadecimal);

        String result = decimalToOctal(decimal);

        return result;
    }
}
