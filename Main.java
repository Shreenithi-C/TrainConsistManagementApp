package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 2.0
 */
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("===========================================");
		System.out.println("=== UC2 - Add Passenger Bogies to Train ===");
		System.out.println("===========================================");
	
		List<String> PassengerBogies = new ArrayList<>();
		PassengerBogies.add("Sleeper");
		PassengerBogies.add("AC Chair");
		PassengerBogies.add("First Class");
		
		System.out.println("\nAfter adding Bogies:");
		System.out.println("PassengerBogies:"+PassengerBogies);
		
		System.out.println("\nAfter removing AC chair:");
		PassengerBogies.remove("AC Chair");
		System.out.println("PassengerBogies:"+PassengerBogies);
		
		System.out.println("\nChecking if 'Sleeper' exists:\nContains Sleeper? : "+PassengerBogies.contains("Sleeper"));
		System.out.println("\nFinal Train Passenger Consist:"+PassengerBogies);
		
		System.out.println("\nUC2 operations completed successfully...");	
	}
}