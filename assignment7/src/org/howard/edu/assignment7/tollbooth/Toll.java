package org.howard.edu.assignment7.tollbooth;


public class Toll implements TollBooth {
	Toll() {
		truckcount = 0;
		receipts = 0;
		}
	
	public void calculateToll(Truck T) {
	
		String newLine = System.getProperty("line.separator");
		
		int axles = T.getAxles();
		int Weight = T.getWeight();
		int tollDue = 5*axles + ((Weight/1000)/2);
		
		System.out.println("Number of axles: " + axles + " axles");
		System.out.println("Weight of the truck: "+ Weight + "kg" );
		
		truckcount = truckcount + 1;
		receipts = receipts + tollDue;
		
		System.out.println("Amount due for " + truckcount + " truck: " + tollDue);
		System.out.println(newLine);
		//System.out.println(tollDue);
		}
		
		public void DisplayData() {
		System.out.println("No. Of trucks passing The toll: " + truckcount);
		System.out.println("Receipts amount when " + truckcount + " trucks pass the toll:" + receipts);
		}
		
		int truckcount;
		int receipts;
}