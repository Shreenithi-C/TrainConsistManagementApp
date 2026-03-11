package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 12.0
 */

import java.util.*;
import java.util.stream.*;

public class Main {
    
    // Inner GoodsBogie class to model goods bogies
    static class GoodsBogie {
        String type;
        String cargo;
        
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
        
        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("=== UC12 - Safety Compliance Check for Goods Bogies ===");
        System.out.println("===================================================\n");
        
        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); //unsafe
        
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);
        
        // Safety rule: Cylindrical bogies must carry Petroleum only
        boolean isSafe = goodsBogies.stream()
            .allMatch(b -> !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum")));
        
        System.out.println("\nSafety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }
        
        System.out.println("\nUC12 safety validation completed...");
    }
}