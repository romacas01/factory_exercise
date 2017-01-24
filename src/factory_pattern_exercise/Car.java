package factory_pattern_exercise;

public class Car extends Vehicle implements VehicleActions{
 
	public Car(String type, int speed, String engineType) {
		this.type = type;
		this.speed = speed;
		this.engineType = engineType;
	} 
	
	@Override
	public void start() {
		System.out.println("Turning key...");
		System.out.println("Starting...");
	}

	@Override
	public void stop() {
		System.out.println("Turning key...");
		System.out.println("Stopping...");
	}

	@Override
	public void move() {
		System.out.println("Driving...");
	}

}
