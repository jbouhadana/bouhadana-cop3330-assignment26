/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = jb.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        double APR = jb.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = jb.nextDouble();
        calculateMonthsUntilPaidOff(balance, APR, monthlyPayment);
    }

    private static void calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPayment)
    {
        double j = (APR/100)/365;
        double one =Math.log(1+((balance/monthlyPayment)*(1-(Math.pow((1+j),30)))));
        double two = Math.pow((1 + j),30);
        double months = -(one/two) * 100;
        System.out.printf("It will take you %.2f months to pay off this card.",months);
    }
}
