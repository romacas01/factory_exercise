package factory_pattern_exercise;

public class Ship extends Vehicle implements VehicleActions{

	public Ship(String type, int speed, String engineType) {
		this.type = type;
		this.speed = speed;
		this.engineType = engineType;
	} 
	
	@Override
	public void start() {
		System.out.println("Pressing the button...");
		System.out.println("Starting...");
	}

	@Override
	public void stop() {
		System.out.println("Pressing the button...");
		System.out.println("Stopping...");
	}

	@Override
	public void move() {
		System.out.println("Sailing...");
	}

}
