package ex14;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
import java.lang.Math;

//What is the order amount? 10
//What is the state? WI
//The subtotal is $10.00.
//The tax is $0.55.
//The total is $10.55.
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = scanner.nextDouble();
        System.out.print("What is the state? ");
        String state = scanner.nextLine();
        while(state.equals(""))
        {
            state = scanner.nextLine();
        }
        if(state.equals("WI"))
        {
            System.out.printf("The subtotal is $%.2f\n", amount);
            double tax = amount * 0.055;
            System.out.printf("The tax is $%.2f.\n", tax);
            amount += tax;
        }
        System.out.printf("The total is $%.2f.\n", amount);
    }
}
