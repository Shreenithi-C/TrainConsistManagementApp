package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 13.0
 */

import java.util.*;
import java.util.stream.*;

public class Main {
    
    static class Bogie {
        String name;
        int capacity;
        
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("=== UC13 - Performance Comparison (Loops vs Streams) ===");
        System.out.println("========================================================\n");
        
        // Prepare test data
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("General", 90));
        }
        
        // Loop-based filtering benchmark
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;
        
        // Stream-based filtering benchmark
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                                           .filter(b -> b.capacity > 60)
                                           .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;
        
        // Results
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
        
        System.out.println("\nUC13 performance benchmarking completed...");
    }
}