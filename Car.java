 public class Car {
    // Private attributes
    private String licensePlate;
    private boolean isRented;

    // Constructor to initialize the license plate
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Initially, the car is available
    }

    // Public method to rent the car
    public boolean rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate " + licensePlate + " has been rented.");
            return true;
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented.");
            return false;
        }
    }

    // Public method to return the car
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate " + licensePlate + " is now available.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " was not rented.");
        }
    }

    // Getter method to check if the car is rented
    public boolean isRented() {
        return isRented;
    }

    // Getter method for license plate
    public String getLicensePlate() {
        return licensePlate;
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car1 = new Car("KDK 238H");

        car1.rentCar();  // Renting the car
        car1.rentCar();  // Trying to rent again
        car1.returnCar(); // Returning the car
        car1.returnCar(); // Trying to return again
    }
}
