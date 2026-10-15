package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        boolean validInput = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose sandwich size:");
        int sandwichSize = 0;

        while (!validInput) {
            System.out.println("1: Regular $5.45");
            System.out.println("2: Large $8.95");
            sandwichSize = myScanner.nextInt();
            if (sandwichSize == 1 || sandwichSize == 2) {
                validInput = true;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }


        System.out.println("Input your age:");
        int userAge = myScanner.nextInt();

        double sandwichPrice;
        double discountAmount;

        if (sandwichSize == 1){
            sandwichPrice = 5.45;
        } else {
            sandwichPrice = 8.95;
        }

        if (userAge <= 17){
            discountAmount = 0.1;
        } else if (userAge >= 65){
            discountAmount = 0.2;
        } else {
            discountAmount = 0;
        }

        sandwichPrice -= sandwichPrice * discountAmount;

        System.out.printf("Your order will be $%.2f", sandwichPrice);
    }
}