package com.mycompany.practice;

import static com.mycompany.practice.Binary.binaryToDecimal;
import static com.mycompany.practice.Binary.binaryToHexadecimal;
import static com.mycompany.practice.Binary.binaryToOctal;
import static com.mycompany.practice.Decimal.decimalToBinary;
import static com.mycompany.practice.Decimal.decimalToHexadecimal;
import static com.mycompany.practice.Decimal.decimalToOctal;
import static com.mycompany.practice.Hexadecimal.hexadecimalToBinary;
import static com.mycompany.practice.Hexadecimal.hexadecimalToDecimal;
import static com.mycompany.practice.Hexadecimal.hexadecimalToOctal;
import static com.mycompany.practice.Octal.octalToBinary;
import static com.mycompany.practice.Octal.octalToDecimal;
import static com.mycompany.practice.Octal.octalToHexadecimal;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var isRunning = true;
        int choice;
        
        while (isRunning) {
            displayMenu();
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
            var isValid = false;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to convert: ");
                    String value = sc.nextLine();
                    System.out.print("Enter source base(2,8,10,16): ");
                    int base = sc.nextInt();
                    sc.nextLine();

                    switch (base) {
                        case 2:
                            isValid = value.matches("[0-1]+");

                            if (isValid) {
                                System.out.print("Enter destination base(2,8,10,16): ");
                                int destination = sc.nextInt();
                                sc.nextLine();
                                System.out.println("------------------------------");

                                switch (destination) {
                                    case 2:
                                        break;
                                    case 8:
                                        binaryToOctal(value);
                                        break;
                                    case 10:
                                        binaryToDecimal(value);
                                        break;
                                    case 16:
                                        binaryToHexadecimal(value);
                                        break;
                                }

                            } else {
                                System.out.printf("Error: %s is not valid base!%n", value);
                            }
                            break;
                        case 8:

                            isValid = value.matches("[0-7]+");

                            if (isValid) {
                                System.out.print("Enter destination base(2,8,10,16): ");
                                int destination = sc.nextInt();
                                sc.nextLine();
                                System.out.println("------------------------------");

                                switch (destination) {
                                    case 2:
                                        octalToBinary(value);
                                        break;
                                    case 8:
                                        break;
                                    case 10:
                                        octalToDecimal(value);
                                        break;
                                    case 16:
                                        octalToHexadecimal(value);
                                        break;
                                }
                            } else {
                                System.out.printf("Error: %s is not valid base!%n", value);
                            }
                            break;
                        case 10:
                            isValid = value.matches("[0-9]+");

                            if (isValid) {
                                System.out.print("Enter destination base(2,8,10,16): ");
                                int destination = sc.nextInt();
                                sc.nextLine();
                                System.out.println("------------------------------");

                                switch (destination) {
                                    case 2:
                                        decimalToBinary(Integer.parseInt(value));
                                        break;
                                    case 8:
                                        decimalToOctal(Integer.parseInt(value));
                                        break;
                                    case 10:
                                        break;
                                    case 16:
                                        decimalToHexadecimal(Integer.parseInt(value));
                                        break;
                                }
                            } else {
                                System.out.printf("Error: %s is not valid base!%n", value);
                            }
                            break;
                        case 16:
                            isValid = value.matches("[0-9a-fA-F]+");

                            if (isValid) {
                                System.out.print("Enter destination base(2,8,10,16): ");
                                int destination = sc.nextInt();
                                sc.nextLine();
                                System.out.println("------------------------------");

                                switch (destination) {
                                    case 2:
                                        hexadecimalToBinary(value);
                                        break;
                                    case 8:
                                        hexadecimalToOctal(value);
                                        break;
                                    case 10:
                                        hexadecimalToDecimal(value);
                                        break;
                                    case 16:
                                        break;
                                }
                            } else {
                                System.out.printf("Error: %s is not valid base!%n", value);
                            }
                            break;
                    }
                    break;
                case 2:
                    isRunning = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Please enter 1 and 2 only!");
            }

        }
    }

    private static void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Convert a number");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }
}
