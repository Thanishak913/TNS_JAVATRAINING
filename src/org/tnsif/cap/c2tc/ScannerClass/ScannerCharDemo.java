package org.tnsif.cap.c2tc.ScannerClass;

import java.util.Scanner;

public class ScannerCharDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String ");
        char c = scan.next().charAt(2);

        System.out.println("Character at index 2 is: " + c);

        scan.close();
    }
}
