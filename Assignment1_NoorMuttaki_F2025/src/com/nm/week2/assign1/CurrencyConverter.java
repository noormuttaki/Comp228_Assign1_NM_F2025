package com.nm.week2.assign1;

import java.util.Scanner;

public class CurrencyConverter {
    private static final double CAD_TO_USD_RATE = 0.73; 

    public void convertCurrency() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter amount in CAD: ");
            double cad = sc.nextDouble();
            double usd = cad * CAD_TO_USD_RATE;
            System.out.println(cad + " CAD = " + usd + " USD");
        }
    }
}
