package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 10.0
 */

import java.util.*;
import java.util.stream.*;

public class Main {
	
	//Inner Bogie class to model passenger bogies
	static class Bogie
	{
		String name;
		int capacity;
		
		Bogie(String name,int capacity)
		{
			this.name=name;
			this.capacity=capacity;
		}
		
		@Override
		public String toString()
		{
			return name+":"+capacity;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("=========================================");
		System.out.println("=== UC10 - Count total seats in train ===");
		System.out.println("=========================================\n");
	    
		//Create list of passenger bogies
		List<Bogie> bogies=new ArrayList<>();
		
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",70));
		
		System.out.println("Bogies in train:");
		for(Bogie b:bogies)
		{
			System.out.println(b);
		}	
		
		int totalCapacity= bogies.stream().map(b->b.capacity).reduce(0,Integer::sum);
		
		System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
		
		System.out.println("\nUC10 Aggregation completed...");
	}
}