package factory_pattern_exercise;

public class VehicleFactory {

	public static Vehicle createVehicle(String vehicleType) {
		
		Vehicle vehicle = null;
		
		switch(vehicleType) {
		
		case "Plane": vehicle = new Plane("Plane", 700, "Turbine");
		              break;
		case "plane": vehicle = new Plane("Plane", 700, "Turbine");
                      break;
		case "Ship": vehicle = new Ship("Ship", 70, "Propeller");
                      break;
        case "ship": vehicle = new Ship("Ship", 70, "Propeller");
                      break;
        case "Car": vehicle = new Car("Car", 200, "V12");
                      break;
        case "car": vehicle = new Car("Car", 200, "V12");
                      break;
	}
	return vehicle;
	}
}
