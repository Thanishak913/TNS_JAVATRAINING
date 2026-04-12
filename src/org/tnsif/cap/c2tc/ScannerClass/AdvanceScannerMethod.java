package org.tnsif.cap.c2tc.ScannerClass;

import java.util.Scanner;

public class AdvanceScannerMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data:");

        while (scan.hasNext()) {

            if (scan.hasNextInt()) {
                int intValue = scan.nextInt();
                System.out.println("Read integer: " + intValue);
            }

            else if (scan.hasNextDouble()) {
                double doubleValue = scan.nextDouble();
                System.out.println("Read double: " + doubleValue);
            }

            else {
                scan.next();  // consume the input
                System.out.println("Unknown input");
            }
        }

        scan.close();
    }
}
