package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 11.0
 */

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("=== UC11 - Validate Train ID and Cargo Code ===");
        System.out.println("===============================================\n");

        Scanner sc = new Scanner(System.in);

        // Prompt user for Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        // Prompt user for Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";       // TRN- followed by 4 digits
        String cargoCodePattern = "PET-[A-Z]{2}";   // PET- followed by 2 uppercase letters

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Match inputs
        boolean isTrainIdValid = trainPattern.matcher(trainId).matches();
        boolean isCargoCodeValid = cargoPattern.matcher(cargoCode).matches();

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed...");
    }
}