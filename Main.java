package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 14.0
 */

//Custom exception class
class InvalidCapacityException extends Exception {
 public InvalidCapacityException(String message) {
     super(message);
 }
}

public class Main {
 
 // Passenger Bogie class with validation
 static class Bogie {
     String type;
     int capacity;
     
     // Constructor enforces capacity rules
     Bogie(String type, int capacity) throws InvalidCapacityException {
         if (capacity <= 0) {
             throw new InvalidCapacityException("Capacity must be greater than zero");
         }
         this.type = type;
         this.capacity = capacity;
     }
     
     @Override
     public String toString() {
         return type + " -> " + capacity;
     }
 }
 
 public static void main(String[] args) {
     System.out.println("===============================================================");
     System.out.println("=== UC14 - Handle Invalid Bogie Capacity (Custom Exception) ===");
     System.out.println("===============================================================\n");
     
     try {
         // Valid bogie
         Bogie sleeper = new Bogie("Sleeper", 72);
         System.out.println("Created Bogie: " + sleeper);
         
         // Invalid bogie (capacity <= 0)
         Bogie invalid = new Bogie("AC Chair", 0);
         System.out.println("Created Bogie: " + invalid);
         
     } catch (InvalidCapacityException e) {
         System.out.println("Error: " + e.getMessage());
     }
     
     System.out.println("\nUC14 exception handling completed...");
 }
}
