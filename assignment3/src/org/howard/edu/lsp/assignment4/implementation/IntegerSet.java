package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;


public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();

	// Clears the internal representation of the set
	public void clear()
	{
			set.clear();
	};

	// Returns the length of the set
	public int length() 
	{
		int len = set.size();
		
		return len;
	};
	
	
	// Returns true if the set contains the value, otherwise false
//	public boolean contains(int value)
//	{
//		if (set.contains(value))
//			return true;
//		return false;
//	};    

	
	// Adds an item to the set or does nothing it already there	
 	public void add(int item)
 	{
 		if(!(set.contains(item)))
 			set.add(item);
 	}; // adds item to s or does nothing if it is in set
 	
 	
	// Removes an item from the set or does nothing if not there
 	public void remove(int item)
 	{
 		if(set.contains(item))
 			set.remove(set.indexOf(item));
 	}; 

 	
	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
//	public boolean equals(IntegerSet b) {…}; 
//

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException
	{
		int max = 0;
		if(set.size() == 0)
		{
			throw new IntegerSetException("Set is Empty");
		}
		else {
			for(int i = 0; i < set.size(); i++) {
				if(set.get(i) > max) {
					max = set.get(i);
				}
			}
		}
		return max;
	}; 

//	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException
	{
		int min = 0;
		if(set.size() == 0)
		{
			throw new IntegerSetException("Set is Empty");
		}
		else {
			for(int i = 0; i < set.size(); i++) {
				if(set.get(i) < min) {
					min = set.get(i);
				}
			}
		}
		return min;
	};


	// Set union
	public void union(IntegerSet intSetb) 
	{
		for(int i = 0; i < set.size(); i++) 
		{
			intSetb.add(set.get(i));
		}
	};

//	// Set intersection
//	public void intersect(IntegerSet intSetb) {…}; 

	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb)
	{
		for(int i = 0; i < set.size(); i++) 
		{
			intSetb.remove(set.get(i));
		}
	}; // set difference, i.e. s1 - s2

	
//	// Returns true if the set is empty, false otherwise
//	boolean isEmpty(); 
//
//	// Return String representation of your set
//	public String toString() {…};	// return String representation of your set

	
	// print set
 	public void print()
 	{
 		System.out.println(set); 
 	};

}
