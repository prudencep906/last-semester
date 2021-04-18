package org.howard.edu.assignment7.tollbooth;

public class DumpTruck extends Toll implements Truck {
	
	DumpTruck (int axles, int Weight) {
		
	this.axles = axles;
	this.Weight = Weight;
	
	}
	
	public int getAxles() {
		
		return axles;
		
		}
	
	public int getWeight() {
		
		return Weight;
		
		}
	
	int axles;
	int Weight;
}
