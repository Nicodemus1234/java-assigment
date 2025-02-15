import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    private String fuelType;

    // Constructor
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call to the superclass constructor
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class to take user input and create a Car object
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Car Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
   }
}