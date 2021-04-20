package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;


public class ListNoZeroes {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>(7);
		
		arrList.add(0);
		arrList.add(7);
		arrList.add(2);
		arrList.add(0);
		arrList.add(0);
		arrList.add(4);
		arrList.add(0);
		
		
		System.out.println("ArrayList elements before removing zeroes: "+ arrList);
		
		removeZeroes(arrList); //call remove zero function
	
		System.out.println("ArrayList elements after removing zeroes: "+ arrList);
	}
	
	private static void removeZeroes(ArrayList<Integer> arrList) {
		
		for (int i = 0; i < arrList.size(); i++)
			if(arrList.get(i) == 0) {
				arrList.remove(i);
				i--;
			}
		
	}

}
