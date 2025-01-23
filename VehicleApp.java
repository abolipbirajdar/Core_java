package task2;
/*Create a parent class called "Vehicle" with attributes
 *  such as brand, model, year, and a method called "drive". 
 *  Create a child class called "Car" that inherits from Vehicle 
 *  and has an additional attribute called "color" and a method called "honk". 
 *  Create an object of the Car class and call both the "drive" and "honk" methods.
 */

//Parent class representing a Vehicle
class Vehicle {
	// Attributes: brand, model, year
	String brand;
	String model;
	int year;

	// Constructor to initialize attributes
	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// Method to print a message when called
	void drive() {
		System.out.println("The " + year + " " + brand + " " + model + " is driving.");
	}
}

//Child class representing a Car, inheriting from Vehicle
class Car extends Vehicle {
	// Additional attribute: color
	String color;

	// Constructor to initialize attributes, including color
	public Car(String brand, String model, int year, String color) {
		super(brand, model, year);
		this.color = color;
	}

	// Method to print a message when called
	void honk() {
		System.out.println("The " + color + " " + brand + " " + model + " says HONK!");
	}
}

public class VehicleApp {
	public static void main(String[] args) {
		// Create an object of the Car class
		Car myCar = new Car("Toyota", "Corolla", 2015, "Silver");

		// Call both the "drive" and "honk" methods
		myCar.drive();
		myCar.honk();
	}
}
/*Output:
The 2015 Toyota Corolla is driving.
The Silver Toyota Corolla says HONK!
*/