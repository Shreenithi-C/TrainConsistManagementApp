package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 6.0
 */
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("=============================================");
		System.out.println("=== UC6 - Map Bogie to Capacity (HashMap) ===");
		System.out.println("=============================================\n");
	
		Map<String,Integer> capacityMap=new HashMap<>();
		
		capacityMap.put("First Class",24);
		capacityMap.put("Cargo",120);
		capacityMap.put("Sleeper",72);
		capacityMap.put("AC chair",56);
		
		System.out.println("Bogie Capacity Details:");
		for(Map.Entry<String,Integer> entry:capacityMap.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nUC6 bogie-capacity mapping completed...");
	}
}