package JavaTraining.Task4;

public class VehicleFactory {
  public static void main(String[] args) {
    Vehicle car = new Car("Hyundai", "2011", "petrol");
    Vehicle bike = new Bike("Bajaj", "2011", "petrol");
    Vehicle bus = new Bus("Ashoka", "2011", "petrol");

    bus.displayInfo();
    System.out.println("\nMax Speed: " + bus.maxSpeed() + "\n");

    car.displayInfo();
    System.out.println("\nMax Speed: " + car.maxSpeed() + "\n");

    bike.displayInfo();
    System.out.println("\nMax Speed: " + bike.maxSpeed() + "\n");

    
    System.out.printf("Total Vehicles: %d ", Vehicle.vehicleCount);

  }
}
