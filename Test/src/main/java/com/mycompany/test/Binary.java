package com.mycompany.test;

import java.util.Scanner;

public class Binary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        
    }
    
    // This is only for clean and short code for the main.
    private static void input() {
        boolean isRunning = true;

        while (isRunning) {

            divider();
            System.out.print("Enter a binary (0-1) only: ");
            String binary = sc.nextLine();

            divider();
            System.out.println("Decimal: " + toDecimal(binary));
            System.out.println("Octal: " + toOctal(binary));
            System.out.println("Hexadecimal: " + toHexadecimal(binary));
            divider();

            System.out.print("Do you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            if (choice == 'n') {
                isRunning = false;
            }
        }
    }

    // For the separator line
    private static void divider() {
        System.out.println("-----------------------");
    }

    // Binary to Decimal
    private static int toDecimal(String input) {

        int decimal = 0;
        int power = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int bit = input.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    // Binary to Octal
    private static String toOctal(String input) {

        String result = "";

        for (int i = input.length(); i > 0; i -= 3) {
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

        return result;
    }

    private static String toHexadecimal(String input) {

        String result = "";
        final char[] hexSymbol = {'0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = input.length(); i > 0; i -= 4) {
            int start = Math.max(0, i - 4);
            String group = input.substring(start, i);

            int value = 0;
            int power = 0;

            for (int j = group.length() - 1; j >= 0; j--) {
                int bit = group.charAt(j) - '0';
                value += bit * Math.pow(2, power);
                power++;
            }

            result = hexSymbol[value] + result;
        }

        return result;

    }
}
