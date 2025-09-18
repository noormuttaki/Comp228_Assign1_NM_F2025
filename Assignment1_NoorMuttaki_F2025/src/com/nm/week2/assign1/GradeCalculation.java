package com.nm.week2.assign1;

import java.util.Scanner;

public class GradeCalculation {

    public void GradeCalc() {
        int marks[] = new int[6];
        float total = 0, avg;

        try (Scanner scanner = new Scanner(System.in)) {
            // Enter marks for 6 subjects
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                total += marks[i];
            }
        }

        // Calculate average
        avg = total / 6;

        // Print grade as per outline
        System.out.print("The student Grade is: ");
        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 80) {
            System.out.println("B");
        } else if (avg >= 70) {
            System.out.println("C");
        } else if (avg >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
