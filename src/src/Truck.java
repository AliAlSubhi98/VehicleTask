package src;

public class Truck extends Vehicle {
	int numberOfAxles;
	double capacityInTons;
	
	public void load(double capacityInTons) {//weightOfTheLoad
		System.out.println("Loaded "+capacityInTons+" tons.");
	}
}
