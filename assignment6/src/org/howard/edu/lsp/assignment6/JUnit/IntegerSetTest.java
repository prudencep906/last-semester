package org.howard.edu.lsp.assignment6.JUnit;

//import static org.junit.jupiter.api.Assertions.*;

// import java.util.ArrayList;

import static org.junit.Assert.*;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	@Test
	public void testClear() {
		
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5); 
		
		//IntegerSet test = new IntegerSet();
		
		setA.clear();
		
		boolean emptySet = setA.isEmpty();
		
		assertEquals(true, emptySet);
		
	}

	@Test
	public void testLength() {
		
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		int len = setA.length();
		
		assertEquals(5, len);
	}

	@Test
	public void testContains() {
		
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		boolean containsFive = setA.contains(5);
		boolean notContainsSix = setA.contains(6);
		
		assertEquals(true, containsFive);
		assertEquals(false, notContainsSix);
	}

//	@Test
//	public void testAdd() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testRemove() {
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		setA.remove(5);
		
		
		boolean containsFive = setA.contains(5);
		
		assertEquals(false, containsFive);
	}

	@Test
	void testEqualsIntegerSet() {
		IntegerSet setA = new IntegerSet();
		IntegerSet setC = new IntegerSet();
		
		// First set A containing 5 values
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		// First set C which equals set A
		setC.add(1); 
		setC.add(2); 
		setC.add(3); 
		setC.add(4); 
		setC.add(5); 
		
		boolean equalSets = setA.equals(setC);
		
		assertEquals(true, equalSets);
	}

	@Test
	public void testLargest() throws IntegerSetException {
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		int largestVal = setA.largest();
		
		assertEquals(5, largestVal);
		
	}

	@Test
	void testSmallest() throws IntegerSetException {
		IntegerSet setA = new IntegerSet();
		
		setA.add(1); 
		setA.add(2); 
		setA.add(3); 
		setA.add(4); 
		setA.add(5);
		
		int smallestVal = setA.smallest();
		
		assertEquals(1, smallestVal);
	}

	@Test
	public void testUnion() {
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setUnion = new IntegerSet();
		
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
		setB.add(19); 
		

		setUnion.add(1); 
		setUnion.add(2); 
		setUnion.add(3); 
		setUnion.add(4); 
		setUnion.add(5); 
		setUnion.add(7); 
		setUnion.add(8); 
		setUnion.add(9); 
		setUnion.add(13); 
		setUnion.add(19); 
		
		setA.union(setB);
		
		boolean equalSets = setA.equals(setUnion);
		
		assertEquals(true, equalSets);
	}

	@Test
	public void testIntersect() {
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setIntersect = new IntegerSet();
		
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
		setB.add(19); 
		
		setIntersect.add(2); 
		setIntersect.add(4); 
		
		setA.intersect(setB);
		
		boolean equalSets = setA.equals(setIntersect);
		
		assertEquals(true, equalSets);
	}

	@Test
	public void testDiff() {
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setDiff = new IntegerSet();
		
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
		setB.add(19); 
		
		setDiff.add(1);
		setDiff.add(3); 
		setDiff.add(5); 
		
		setA.diff(setB);
		
		boolean equalSets = setA.equals(setDiff);
		
		assertEquals(true, equalSets);
	}

	@Test
	public void testIsEmpty() {
		IntegerSet setA = new IntegerSet();
		
		boolean emptySet = setA.isEmpty();
		
		assertEquals(true, emptySet);
	}

//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPrint() {
//		fail("Not yet implemented");
//	}

}
