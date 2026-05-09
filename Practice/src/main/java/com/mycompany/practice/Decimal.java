package com.mycompany.practice;

import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Octal: " + toOctal(number));
        System.out.println("Hexa: " + toHexa(number));

    }

    // Decimal to Binary
    private static String toBinary(int number) {

        String result = "";

        while (number > 0) {
            result = number % 2 + result;
            number = number / 2;
        }

        return result;
    }

    //Decimal to Octal
    private static String toOctal(int number) {

        String result = "";

        while (number > 0) {
            result = number % 8 + result;
            number = number / 8;
        }

        return result;
    }

    // Decimal to Hexadecimal
    private static String toHexa(int number){
        
        String result = "";
        char[] hexSymbols = {'0', '1', '2', '3', '4','5',
                                    '6', '7', '8', '9', 'A',
                                    'B', 'C', 'D','E', 'F'};
        
        while(number > 0){
            result = hexSymbols[number % 16] + result;
            number = number / 16;
        }
        
        return result;
    }
}   
