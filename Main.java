package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 20.0
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("=== UC20 - Exception Handling During Search ===");
        System.out.println("===========================================\n");

        // Empty bogie list to simulate invalid state
        List<String> bogieIds = new ArrayList<>();

        // Search key
        String searchKey = "BG309";

        // Defensive check before searching
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // Binary Search (only runs if list is not empty)
        int low = 0;
        int high = bogieIds.size() - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds.get(mid));

            if (comparison == 0) {
                System.out.println("Bogie " + searchKey + " found in train consist.");
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC20 search completed...");
    }
}
