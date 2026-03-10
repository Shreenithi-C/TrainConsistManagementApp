package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 3.0
 */
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("====================================");
		System.out.println("=== UC3 - Track Unique Bogie IDs ===");
		System.out.println("====================================\n");
	
		Set<String> Bogies = new HashSet<>();
		
		//Add bogies with duplicates
		Bogies.add("BG101");
		Bogies.add("BG102");
		Bogies.add("BG103");
		Bogies.add("BG104");
		Bogies.add("BG101");
		Bogies.add("BG102");
		
		System.out.println("Bogie IDs after insertion:");
		System.out.println(Bogies);
		
		System.out.println("\nNote: Duplicates are automatically ignored by HashSet");
		System.out.println("\nUC3 uniqueness validation completed...");
		
	}
}