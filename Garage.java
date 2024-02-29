//Creates the Car class

public class Car {
    //Creates the variables
    public String brand;
    private String model;
    double fuelLevel;
    double distance;

//Constructor
  public Car(String brand, String model, double fuelLevel){
    //Sets the values of the variables
    this.brand = brand;
    this.model = model;
    this.fuelLevel = fuelLevel;
    this.distance = 200;
  }
    //Method to simulate driving
  public void drive(double distance){
    fuelLevel -= distance * 0.1;
  }

//Method to refuel the car
  public void refuelCar(double fuelLevel){
    this.fuelLevel += 50;
    
  }
  //Method to display the info 
  public void displayInfo(){
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Fuel Level: " + fuelLevel);
  }
  
}


//Creates the Garage class
public class Garage{

  
  public static void main(String[] args) {
    //Sets the values for both cars
  Car car1 = new Car("Toyota", "Camry", 50);
  Car car2 = new Car("Honda", "Civic", 40);

    //Displays the info of the cars
    System.out.println("Car 1:");
    car1.displayInfo();
    System.out.println("Car 2:");
    car2.displayInfo();
    //Simulates driving the car and decreases the fuel levels
    car1.drive(10);
    car2.drive(20);

    //Refuels the car 
    car1.refuelCar(50);
    car2.refuelCar(50);

    //Prints the updated stats of the cars
    System.out.println(car1.brand + " refueled to " + car1.fuelLevel + " liters.");
    System.out.println(car2.brand + " refueled to " + car2.fuelLevel + " liters.");
    


    
}
}
