package com.company.Pattern12;

import java.util.Scanner;

public class Patter12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Printing the pattern: ");

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =2; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
