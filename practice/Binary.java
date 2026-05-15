package com.mycompany.practice;

public class Binary extends Decimal {

    public static Decimal decimal = new Decimal();

    public static int binaryToDecimal(String binary) {

        int decimal = 0;
        int power = 0;
        int step = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            int value = (int) Math.pow(2, power);
            int total = bit * value;
            System.out.printf("Step %d: %d * 2 ^ %d = %d%n",
                    step, bit, power, total);
            decimal += total;
            power++;
            step++;
        }
        System.out.printf("Result: %d%n", decimal);
        return decimal;
    }

    public static String binaryToOctal(String binary) {

        String result = "";

        int decimal = binaryToDecimal(binary);

        result = String.valueOf(decimalToOctal(decimal));

        return result;
    }

    public static String binaryToHexadecimal(String binary) {

        String result = "";

        int decimal = binaryToDecimal(binary);

        result = String.valueOf(decimalToHexadecimal(decimal));

        return result;
    }
}