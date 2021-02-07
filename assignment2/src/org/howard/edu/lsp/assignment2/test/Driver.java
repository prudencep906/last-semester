package org.howard.edu.lsp.assignment2.test;

import java.util.Arrays;

import org.howard.edu.lsp.assignment2.CombinationSum;
import org.howard.edu.lsp.assignment2.combination.Test1;

public class Driver {

	public static void main(String[] args) 
	{
		CombinationSum Combination = new CombinationSum();
		int arr[] = {1, 0, 8, 4, 7, 6, 9, 21, 3};
	    int n = arr.length;
	    int sum = 1;
	    
	    String newLine = System.getProperty("line.separator");
	    
	    System.out.println("Array : "+ Arrays.toString(arr));
	    System.out.println("Target sum : "+ sum);
	      
	    System.out.println(newLine);
	    Combination.printCombos(arr, n, sum);

	}

}
