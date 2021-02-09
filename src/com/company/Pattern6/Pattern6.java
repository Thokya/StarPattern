package com.company.Pattern6;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Printing the pattern: ");

        for (int i = rows; i >= 1; i--) {
            // print star in decreasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

            // print space in increasing order
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
