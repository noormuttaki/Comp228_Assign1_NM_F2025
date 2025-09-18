package com.nm.week2.assign1;

import java.util.Scanner;

public class LitersToGallons {

    public void convertLiters() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter liters: ");
            double liters = sc.nextDouble();
            double gallons = liters * 0.264172;
            System.out.println(liters + " liters = " + gallons + " gallons");
        }
    }
}
