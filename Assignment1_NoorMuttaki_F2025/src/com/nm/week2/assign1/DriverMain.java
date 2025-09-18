package com.nm.week2.assign1;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create objects for tasks a–d
        GradeCalculation gc = new GradeCalculation();
        MilesToKilometers mk = new MilesToKilometers();
        LitersToGallons lg = new LitersToGallons();
        CurrencyConverter cc = new CurrencyConverter();

        // Menu
        System.out.println("Choose an operation:");
        System.out.println("1 - Grade Calculation");
        System.out.println("2 - Miles to Kilometers");
        System.out.println("3 - Liters to Gallons");
        System.out.println("4 - CAD to USD Conversion");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Performing Grade Calculation...");
                gc.GradeCalc();
                break;
            case 2:
                System.out.println("Converting Miles to Kilometers...");
                mk.convertMiles();
                break;
            case 3:
                System.out.println("Converting Liters to Gallons...");
                lg.convertLiters();
                break;
            case 4:
                System.out.println("Converting CAD to USD...");
                cc.convertCurrency();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
