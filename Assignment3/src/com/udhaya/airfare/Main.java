package com.udhaya.airfare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double cost = sc.nextDouble();

        Airfare airfare = null;

        if (choice == 1) {
            airfare = new AirIndia(hours, cost);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, cost);
        } else if (choice == 3) {
            airfare = new Indigo(hours, cost);
        }

        double result = airfare.calculateAmount();
        System.out.printf("%.2f", result);
    }
}
