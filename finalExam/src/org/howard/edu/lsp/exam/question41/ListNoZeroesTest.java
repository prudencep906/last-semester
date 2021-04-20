package org.howard.edu.lsp.exam.question41;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ListNoZeroesTest {

	@Test
	void removeZeroesTest() {
		ArrayList<Integer> arrList = new ArrayList<Integer>(6);
		ArrayList<Integer> arrListExpected = new ArrayList<Integer>(6);
		
		arrList.add(0);
		arrList.add(7);
		arrList.add(2);
		arrList.add(0);
		arrList.add(0);
		arrList.add(4);
		arrList.add(0);
		
		arrListExpected.add(7);
		arrListExpected.add(2);
		arrListExpected.add(4);
		
		removeZeroes(arrList);
		
		boolean equalLists = arrList.equals(arrListExpected);
		
		assertEquals(true, equalLists);
	}

	private void removeZeroes(ArrayList<Integer> arrList) {
		for (int i = 0; i < arrList.size(); i++)
			if(arrList.get(i) == 0) {
				arrList.remove(i);
				i--;
			}
		
	}

}
