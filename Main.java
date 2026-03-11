package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 15.0
 */

//Custom runtime exception for unsafe cargo assignment
class CargoSafetyException extends RuntimeException {
 public CargoSafetyException(String message) {
     super(message);
 }
}

public class Main {
 
 // Goods Bogie class
 static class GoodsBogie {
     String shape;
     String cargo;
     
     GoodsBogie(String shape) {
         this.shape = shape;
     }
     
     // Assign cargo with validation
     void assignCargo(String cargo) {
         try {
             // Rule: Petroleum cannot be assigned to Rectangular bogies
             if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                 throw new CargoSafetyException("Unsafe cargo assignment!");
             }
             
             this.cargo = cargo;
             System.out.println("Cargo assigned successfully -> " + cargo);
             System.out.println("Cargo validation completed for " + shape + " bogie");
             
         } catch (CargoSafetyException e) {
             System.out.println("Error: " + e.getMessage());
             System.out.println("Cargo validation completed for " + shape + " bogie");
         } finally {
             System.out.println("Logging: Cargo assignment attempt finished for " + shape + " bogie");
         }
     }
 }
 
 public static void main(String[] args) {
     System.out.println("===========================================");
     System.out.println("====== UC15 - Safe Cargo Assignment ======");
     System.out.println("===========================================\n");
     
     // Valid assignment
     GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
     cylindrical.assignCargo("Petroleum");
     
     System.out.println();
     
     // Unsafe assignment
     GoodsBogie rectangular = new GoodsBogie("Rectangular");
     rectangular.assignCargo("Petroleum");
     
     System.out.println("\nUC15 runtime handling completed...");
 }
}
