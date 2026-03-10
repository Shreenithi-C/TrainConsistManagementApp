package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 4.0
 */
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("============================================");
		System.out.println("=== UC4 - Maintain Ordered Bogie Consist ===");
		System.out.println("============================================\n");
	
		List<String> trainConsist=new LinkedList<>();
		
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		
		System.out.println("Initial Train Consist:");
		System.out.println(trainConsist);
		
		trainConsist.add(2,"Pantry Car");
		System.out.println("\nAfter inserting 'Pantry Car' at position 2:");
		System.out.println(trainConsist);
		
		System.out.println("\nAfter removing first and last Bogies:");
		trainConsist.removeFirst();
		trainConsist.removeLast();
		System.out.println(trainConsist);
		
		System.out.println("\nUC4 ordered consist operations completed...");
	}
}