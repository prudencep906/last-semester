package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;

/**
 * 
 * @author temip
 *
 */
public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();

	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear()
	{
		set.clear();
	};

	
	/**
	 * Return the length of the set
	 * @return len
	 */
	public int length() 
	{
		int len = set.size();
		
		return len;
	};
	
	
	/**
	 * Method returns true if the set contains the value, otherwise false
	 * @param value Item being checked for in the set
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value)
	{
		return set.contains(value);
	};    

	
	/**
	 * Adds an item to the set or does nothing it already there
	 * @param item Value being added to the set
	 */
 	public void add(int item)
 	{
 		if(!(set.contains(item)))
 			set.add(item);
 	};
 	
 	
 	
 	/**
 	 * Removes an item from the set or does nothing if not there
 	 * @param item Value being removed from the set
 	 */
 	public void remove(int item)
 	{
 		if(set.contains(item))
 			set.remove(set.indexOf(item));
 	}; 

 	
	/**
	 * Returns true if set A is equal to set B
	 * @param b Set being compared to current set
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
 	 * Return the largest item in the set
 	 * @return max largest item in the set
 	 * @throws IntegerSetException Throws IntegerSetException if the set is empty
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
	 * Returns the smallest item in the set
	 * @return min smallest item in the set 
	 * @throws IntegerSetException If the set is empty
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
	 * Add the elements of from set B into set A without repeating any values
	 * @param intSetb Second set to perform union operation on
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
	 * Find the common values in the set 
	 * @param intSetb Second set to perform intersection operation on
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
	 * Remove elements present in set B from set A and keep the result in set A
	 * @param intSetb Second set to perform difference operation on
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
	 * Return true if the set is empty, false otherwise
	 * @return true if the set is empty, false otherwise
	 */
	public boolean isEmpty()
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

	
	private int get(int index)
	{
		return set.get(index);
	};
	
	
	/**
	 * Print out the values of the array list
	 */
 	public void print()
 	{
 		System.out.println(set); 
 	};
}
