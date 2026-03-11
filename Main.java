package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 9.0
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
		System.out.println("===================================================");
		System.out.println("=== UC8 - Filter Passenger Bogies using Streams ===");
		System.out.println("===================================================\n");
	    
		//Create list of passenger bogies
		List<Bogie> bogies=new ArrayList<>();
		
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",70));
		bogies.add(new Bogie("AC chair",60));
		
		System.out.println("All Bogies:");
		for(Bogie b:bogies)
		{
			System.out.println(b);
		}	
		
		Map<String,List<Bogie>> groupedBogies=bogies.stream().collect(Collectors.groupingBy(b->b.name));
		
		System.out.println("\nGrouped Bogies:");
		for(Map.Entry<String,List<Bogie>> entry:groupedBogies.entrySet())
		{
			System.out.println("\nBogie Type:"+entry.getKey());
			for(Bogie b:entry.getValue())
			{
				System.out.println("Capacity->"+b.capacity);
			}
		}
		System.out.println("\nUC9 grouping completed...");
	}
}