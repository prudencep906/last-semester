package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class Driver {

	public static void main(String[] args) throws IntegerSetException 
	{
		String newLine = System.getProperty("line.separator");
		
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setC = new IntegerSet();
		
		// First set A containing 5 values
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5); 
		
		// Second set B containing 7 values
		setB.add(7); 
		setB.add(2); 
		setB.add(8); 
		setB.add(4); 
		setB.add(9); 
		setB.add(13); 
		setB.add(8); // attempting to add a duplicate value
		setB.add(19); 
		
		// First set C which equals set A
		setC.add(1); 
		setC.add(2); 
		setC.add(3); 
		setC.add(4); 
		setC.add(5); 
        
        int sizeOfA = setA.length(); // Check length of set A
        int sizeOfB = setB.length(); // Check length of set B
        
        int largeVal = setA.largest();
        int smallVal = setB.smallest();
        

        // Print out set A
        System.out.println("Set A: "); 
        setA.print();
        
        System.out.println(newLine);
        
        // Print out set B
        System.out.println("Set B: "); 
        setB.print();
        
        
        System.out.println(newLine);
        
        // print length of set 
        System.out.println("The size of the set A is: " + sizeOfA); 
        System.out.println("The size of the set B is: " + sizeOfB); 
        
        System.out.println(newLine);
        
        // Remove 13 from set B and print out the resulting set
        setB.remove(13);
        System.out.println("Set B after removing 13: "); 
        setB.print();
       
        System.out.println(newLine);
        
        // Check if set A is equal to set B
        System.out.println(setA.equals(setB));
        // Check if set C is equal to set A
        System.out.println(setC.equals(setA));
        
        System.out.println(newLine);
        
        // print largest value of setA and smallest value of setB 
        System.out.println("The largest value of set A is: " + largeVal); 
        System.out.println("The smallest value of set B is: " + smallVal);
        
        System.out.println(newLine);
        
        // get the union of set A and set B and print the result
        setA.union(setB);
        System.out.println("The union between set A and set B gives: ");
        setA.print();
        
        System.out.println(newLine);
        
        // get the intersect of set A and set B and print the result
        setA.intersect(setB);
        System.out.println("The intersect between set A and set B gives: ");
        setA.print();
        
        System.out.println(newLine);
        
        // get the set difference of set A and set B and print the result
        setA.diff(setB);
        System.out.println("The difference between set A and set B gives: ");
        setA.print();
        
        System.out.println(newLine);
        
        // Check if set A is empty
        System.out.println(setA.isEmpty());

	}

}
