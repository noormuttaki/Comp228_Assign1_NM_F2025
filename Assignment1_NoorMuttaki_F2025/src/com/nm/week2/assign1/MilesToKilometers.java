package com.nm.week2.assign1;

import java.util.Scanner;

public class MilesToKilometers {

    public void convertMiles() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter miles: ");
            double miles = sc.nextDouble();
            double km = miles * 1.60934;
            System.out.println(miles + " miles = " + km + " kilometers");
        }
    }
}
