package com.mycompany.practice;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        binaryToDecimal(input);
        binaryToOctal("1111");
    }

    private static void binaryToDecimal(String input) {

        int decimal = 0;
        int power = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int bit = input.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        System.out.println(decimal);
    }

    private static void binaryToOctal(String input) {

        String result = "";

        for (int i = input.length(); i >= 0; i -= 3) {
            int start = Math.max(0, i - 3);
            String group = input.substring(start, i);

            int value = 0;
            int power = 0;

            for (int j = group.length() - 1; j >= 0; j--) {
                int bit = group.charAt(j) - '0';
                value += bit * Math.pow(2, power);
                power++;
            }
            result = value + result;
        }
        System.out.println(result);
    }
}
