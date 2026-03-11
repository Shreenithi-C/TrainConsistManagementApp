package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 18.0
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("=== UC18 - Linear Search for Bogie ID ===");
        System.out.println("===========================================\n");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search key
        String searchKey = "BG309";

        // Linear Search
        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                System.out.println("\nBogie " + searchKey + " found in train consist.");
                found = true;
                break; // Early termination
            }
        }

        if (!found) {
            System.out.println("\nBogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}

