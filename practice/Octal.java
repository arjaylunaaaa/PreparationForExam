package com.mycompany.practice;

public class Octal extends Decimal {

    public static int octalToDecimal(String octal) {

        int decimal = 0;
        int power = 0;
        int step = 1;

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            int value = digit * (int) Math.pow(8, power);
            int total = value;
            System.out.printf("Step %d: %d * 8 ^ %d = %d%n",
                    step,
                    digit,
                    power,
                    total);
            decimal += total;
            step++;
            power++;
        }
        System.out.printf("Result: %d%n", decimal);

        return decimal;
    }

    public static String octalToBinary(String octal) {

        String result = "";

        int octalValue = octalToDecimal(octal);

        result = String.valueOf(decimalToBinary(octalValue));

        return result;
    }

    public static String octalToHexadecimal(String octal) {

        String result = "";

        int octalValue = octalToDecimal(octal);

        result = String.valueOf(decimalToHexadecimal(octalValue));

        return result;
    }
}