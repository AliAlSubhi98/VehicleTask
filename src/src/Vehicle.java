package src;

public class Vehicle extends Engine implements Honkable {
	String make;
	String model;
	int year;
	String color;
	int numberOfWheels;
	float weight;
	private String engine ;

	public void start() {
		System.out.println("Vehicle started.");
	}

	public void stop() {
		System.out.println("Vehicle stopped.");
	}

	public void drive(double numberOfMiles) {
		System.out.println("Vehiclie driven " + numberOfMiles + " miles");
	}

	public void honk() {
		System.out.println("Honk Honk!");
	}
	public void setEngine(String myEngine) {
		this.engine=myEngine;
	}

	public String getEngine() {
		System.out.println(engine);
		return engine;
	}

	@Override
	void startEngine() {
		System.out.println("Engine Started.");
	}
}