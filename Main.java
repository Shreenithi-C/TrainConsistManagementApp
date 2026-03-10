package com.TrainConsistManagementApp.consist;

/*
 * @author developer
 * @version 7.0
 */
import java.util.*;

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
		System.out.println("==================================================");
		System.out.println("=== UC7 - Sort Bogies by Capacity (Comparator) ===");
		System.out.println("==================================================\n");
	
		List<Bogie> bogies=new ArrayList<>();
		
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("General",90));
		
		System.out.println("Before sorting:");
		for(Bogie b:bogies)
		{
			System.out.println(b);
		}	
		
		System.out.println("\nAfter sorting by capacity:");
		bogies.sort(Comparator.comparingInt(b->b.capacity));
		for(Bogie b:bogies)
		{
			System.out.println(b);
		}
		
		System.out.println("\nUC7 sorting completed...");
	}
}