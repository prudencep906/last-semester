package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

public class Driver {

	public static void main(String[] args) 
	{
		String newLine = System.getProperty("line.separator");
		
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		
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
        
        int sizeOfA = setA.length(); // Check length of set A
        int sizeOfB = setB.length(); // Check length of set B
        

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
       
//        System.out.println(newLine);        
        

	}

}
