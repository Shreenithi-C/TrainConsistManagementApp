package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 19.0
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("=== UC19 - Binary Search for Bogie ID ===");
        System.out.println("===========================================\n");

        // Sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search key
        String searchKey = "BG309";

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("\nBogie " + searchKey + " found using Binary Search.");
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left half
            } else {
                low = mid + 1; // search right half
            }
        }

        if (!found) {
            System.out.println("\nBogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
