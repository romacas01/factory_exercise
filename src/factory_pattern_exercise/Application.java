package factory_pattern_exercise;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		System.out.println("What type of vehicle you would like?");
		
		String vehicleType = input.nextLine();
		Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);
		
		if(vehicle != null) {
			System.out.println("The vehicle you chosen is a " + vehicle.getType() + 
					           " it has a speed of " + vehicle.getSpeed() + " KM/H " +
					           " and has a " + vehicle.getEngineType() + " engine.");
		}else {
			System.out.println("Sorry it was not possible to create a vehicle of type " + vehicleType);
		}
	}

}
