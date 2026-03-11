package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 16.0
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("=== UC16 - Manual Sorting using Bubble Sort ===");
        System.out.println("==================================================\n");

        // Original capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Bubble Sort Algorithm
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
