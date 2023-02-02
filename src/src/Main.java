package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Car myCar = new Car();
		Truck myTruck = new Truck();
		ElectricVehicle myTesla = new ElectricVehicle();
		
		myCar.start();
		myCar.honk();
		myCar.drive(15);
		System.out.println("Enter Car Engine Type");
		Scanner sc = new Scanner(System.in);
		String engineType = sc.next();// Patrol
		sc.close();
		myCar.setEngine(engineType);
		myCar.getEngine();
		myCar.stop();
		
		myTruck.start();
		myTruck.honk();
		myTruck.drive(50);
		myTruck.setEngine("Deisel");
		myTruck.getEngine();
		myTruck.stop();
		
		myTesla.start();
		myTesla.drive(55);
		myCar.start();
	}
}
