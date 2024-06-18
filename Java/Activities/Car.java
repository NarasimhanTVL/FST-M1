package activities_session_2;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public Car() {
		this.tyres=4;
		this.doors=4;
	}
	public void displayCharacteristics() {
		System.out.println("make of car is: "+ make);
		System.out.println("Color if the car is "+ color);
		System.out.println("Transmission of car is "+ transmission);
		System.out.println("Number of tyres is : " +tyres);
		System.out.println("Number of doors is : " + doors);
	}
	public void accelarate() {
		System.out.println("The car is moving forward");
	}
	public void brake() {
		System.out.println("The car has stopped");
	}
}
