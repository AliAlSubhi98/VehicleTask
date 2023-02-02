package src;

public class ElectricVehicle extends Vehicle{
	double batteryCapacity;
	int chargeLevel;
	
	public void charge() {
		System.out.println("Car is charging.");
	}
	@Override
	public void drive(double numberOfMiles) {
		System.out.println("Electric vehicle driven " +numberOfMiles+ " miles");
	}
}
