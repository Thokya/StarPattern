package com.company.Pattern3;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Printing the pattern: ");

        for (int i = 1; i <=rows; i++) {
            // print star in decreasing order
            for (int k = rows; k >= i; k--) {
                System.out.print("*");
            }
            // print space in increasing order
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
