package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;
import java.util.List;


public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();

	
	/**
	 * Clears the internal representation of the set
	 * 
	 */
	public void clear()
	{
			set.clear();
	};

	
	/**
	 * 
	 * @return len: the length of the set
	 */
	public int length() 
	{
		int len = set.size();
		
		return len;
	};
	
	
	/**
	 * 
	 * @param value
	 * @return true if the set contains the value, otherwise false
	 * 
	 */
	public boolean contains(int value)
	{
		return set.contains(value);
	};    

	
	/**
	 * 
	 * @param item
	 * Adds an item to the set or does nothing it already there
	 * 
	 */
 	public void add(int item)
 	{
 		if(!(set.contains(item)))
 			set.add(item);
 	};
 	
 	
 	
 	/**
 	 * 
 	 * @param item
 	 * Removes an item from the set or does nothing if not there
 	 * 
 	 */
 	public void remove(int item)
 	{
 		if(set.contains(item))
 			set.remove(set.indexOf(item));
 	}; 

 	
	/**
	 * 
	 * @param b
	 * @return true if set A is equal to set B
	 */
	public boolean equals(IntegerSet b)
	{
		if(b.length() == set.size())
		{
			int j = 1;
			for(int i = 0; i < set.size(); i++)
			{
				if(b.contains(set.get(i)))
					j = 1;
				else
					break;
			}
			if(j == 1)
				return true;
		}
		return false;
	};

 	
 	/**
 	 * 
 	 * @return max: largest item in the set
 	 * @throws IntegerSetException: Throws IntegerSetException if the set is empty
 	 * 
 	 */
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

	/**
	 * 
	 * @return min: smallest item in the set 
	 * @throws IntegerSetException: if the set is empty
	 * 
	 */
	public int smallest() throws IntegerSetException
	{
		int min = set.get(0);
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


	/**
	 * 
	 * @param intSetb
	 * Add the elements of from set B into set A without repeating any values
	 * 
	 */
	public void union(IntegerSet intSetb) 
	{
		for(int i = 0; i < intSetb.length(); i++) 
		{
			if(!set.contains(intSetb.get(i)))
				set.add(intSetb.get(i));
		}
	};

	
	
	/**
	 * 
	 * @param intSetb
	 * Find the common values in the set 
	 * 
	 */
	public void intersect(IntegerSet intSetb)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < set.size(); i++)
		{
			if(intSetb.contains(set.get(i)))
				result.add(set.get(i));
		}
		set.clear();
		set = result;
	};

	
	/**
	 * 
	 * @param intSetb
	 * Remove elements present in set B from set A and keep the result in set A
	 * 
	 */
	public void diff(IntegerSet intSetb)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < set.size(); i++)
		{
			if(!intSetb.contains(set.get(i)))
				result.add(set.get(i));
		}
		set.clear();
		set = result;
	};

	
	/**
	 * 
	 * @return true if the set is empty, false otherwise
	 * 
	 */
	boolean isEmpty()
	{
		return set.isEmpty();
	}; 

	
	/**
	 * Return String representation of your set
	 */
	public String toString() 
	{
		return set.toString();
	};

	
	/**
	 * 
	 * @param index
	 * Get the index of a value in the array list
	 * 
	 */
	public int get(int index)
	{
		return set.get(index);
	};
	
	
	/**
	 * Print out the values of the array list
	 * 
	 */
 	public void print()
 	{
 		System.out.println(set); 
 	};
}
