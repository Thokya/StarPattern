package com.company.Pattern7;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Printing the pattern: ");

        for (int i = 1; i <= rows; i++) {
            // print space in decreasing order
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // print star in increasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//===========================================================
        for (int i = rows - 1; i >= 1; i--) {
            // print space in increasing order
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // print star in decreasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
