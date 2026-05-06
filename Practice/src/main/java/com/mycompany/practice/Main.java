package com.mycompany.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    System.out.println("Octal: " + toBinary(number));
                }
                case 2 -> {
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    System.out.println("Binary: " + toOctal(number));
                }
                case 3 -> {
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    System.out.println("Hexadecimal: " + toHex(number));
                }
                case 4 ->
                    System.out.println("Bye");
                default ->
                    System.out.println("Invalid input!");
            }
        } while (choice != 4);
    }

    private static void displayMenu() {
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexa");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static String toBinary(int number) {

        String result = "";

        while (number > 0) {
            int remainder = number % 2;
            result = remainder + result;
            number = number / 2;
        }

        return result;
    }

    private static String toOctal(int number) {

        String result = "";

        while (number > 0) {
            int remainder = number % 8;
            result = remainder + result;
            number = number / 8;
        }

        return result;
    }

    private static String toHex(int number) {

        String result = "";
        String hexSymbols = "0123456789ABCDEF";

        while (number > 0) {
            int remainder = number % 16;
            result = hexSymbols.charAt(remainder) + result;
            number = number / 16;
        }

        return result;
    }
}
