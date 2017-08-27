package com.company;

import java.util.Scanner;

public class PrimeNumbers {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        System.out.println("Prime numbers from 2 to n are :");
        System.out.println(calculatePrimNumbers(n));
    }

    private static String calculatePrimNumbers(int n) {
        int i, j;
        StringBuilder primeNumbers = new StringBuilder();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers.append(i).append(" ");
            }
        }
        return primeNumbers.toString();
    }
}