package com.nm.week2.assign1;

import java.util.Scanner;

public class GradeCalculation {

    public void GradeCalc() {
        int marks[] = new int[4];  // only 4 subjects
        float total = 0, avg;

        try (Scanner scanner = new Scanner(System.in)) {
            // Enter marks for 4 subjects
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                total += marks[i];
            }
        }

        // Calculate average
        avg = total / 4;

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
