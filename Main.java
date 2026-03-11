package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 17.0
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("=== UC17 - Sort Bogie Names Using Arrays.sort() ===");
        System.out.println("==================================================\n");

        // Original bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}
