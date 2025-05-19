package JavaTraining.Task4;

// Create a vehicle class hierarchy. Base class - Vehicle & Subclasses would be Bus, Car, & Bike
// Each subclass should have make (Eg, Tata) , year  (Eg: 2019) & fuel type (Eg: Petrol)
// Base Class should have a method which displays the make, year & fuel type
// Each subclass should have implementation for returning max speed.
// Max speed Bus is 80, Max speed for Car is 120, Max speed for Bike is 100ac

abstract class Vehicle {

  protected String make;
  protected String year;
  protected String fuelType;
  static int vehicleCount = 0;

  public Vehicle(String make, String year, String fuelType) {
    this.make = make;
    this.year = year;
    this.fuelType = fuelType;
    vehicleCount++ ;
  }

  public void displayInfo() {
    System.out.printf("Make: %s, Year: %s, Fuel Type: %s ", make, year, fuelType);
  }

  public abstract int maxSpeed();

  static int showTotalVehicles() {
    return vehicleCount;
  }

}

class Bus extends Vehicle {

  public Bus(String make, String year, String fuelType) {
    super(make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 80;
  }

}

class Car extends Vehicle {

  public Car(String make, String year, String fuelType) {
    super(make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 120;
  }

}

class Bike extends Vehicle {

  public Bike(String make, String year, String fuelType){
    super(make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 100;
  }
}
