package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 8.0
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
		bogies.add(new Bogie("General",90));
		
		System.out.println("All Bogies:");
		for(Bogie b:bogies)
		{
			System.out.println(b);
		}	
		
		List<Bogie> filteredBogies= bogies.stream().filter(b->b.capacity>60).collect(Collectors.toList());
		
		System.out.println("\nFiltered Bogies (Capacity>60):");
		for(Bogie b:filteredBogies)
		{
			System.out.println(b);
		}
		
		System.out.println("\nUC8 filtering completed...");
	}
}