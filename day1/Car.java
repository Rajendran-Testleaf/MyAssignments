package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive the care on left side of road");
	}
	
	public void applyBrake() {
		System.out.println("Press the brake shoe slowly");
		
	}
	
	public void soundHorn() {
		System.out.println("Blow the Horn");
	}
	
	public void isPuncture() {
		System.out.println("Tyre is flat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj= new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
	}

}
