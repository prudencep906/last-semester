package org.howard.edu.assignment7.tollbooth;

public class TestDriver {

	public static void main(String[] args) {
		TollBooth booth = new Toll();

		Truck ford = new DumpTruck(5, 12000); 	// 5 axles and 12000 kilograms

		booth.calculateToll(ford);
		booth.DisplayData();
		

	}

}
