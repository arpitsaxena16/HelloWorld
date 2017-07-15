 abstract class Vehicle {
	 
	 
	 int vin;
	 String model;
	 int speed;
	 
	 void detail() {
	 System.out.println("VIN : " + vin);
	 System.out.println(" model name : " + speed);
	 System.out.println("speed : " + speed);
	 }
	 
	 
	 abstract void drive();
	 
	 abstract void inspect();
	 
	 Vehicle() {
	 }
	 
	 Vehicle(int vin, String name, int speed) {
		 this.vin = vin;
		 this.name = name;
		 this.speed = speed;
		 
	 }
	 
 }
 
 class Bike extends Vehicle {
	 
		String color;
		
		vehicle.detail();
		
		Bike(int vin, String model, int speed, String color) {
			super(vin, model, speed);
			this.color = color;
		}
		
		void detail(int vin, String model, int speed, String color) {
			super.detail(vin, model, speed);
			System.out.println("Color :" + color);
				
		}
		
		void drive() {
			System.out.println("Bike is driven");
		}

		void inspect () {
			System.out.println("Bike is inspected");
		}
 }			
 class Car extends Vehicle {
		int milage;  // kmph
		
		
		Car(int vin, String model, int speed, int milage) {
			super(vin, model, speed);
			this.milage = milage;
		}
		
		void detail(int vin, String model, int speed, int milage) {
			super.detail(vin, model, speed);
			System.out.println("Milage : " + milage);
		}
		
		void drive() {
			System.out.println("Car is driven");
		}

		void inspect () {
			System.out.println("Car is inspected");
		}
 }
 
 class Mechanic() {
	public static void main(String[] s) {
		Vehicle vehicle = new Vehicle(33, "", 100);
		Bike bike = new Bike(51, "Splender", 50, "Blue");
		Car car = new Car(22, "Swift Dezire", 60, 25);
		
		vehicle.detail();
		bike.detail();
		bike.drive();
		bike.inspect();
		car.detail();
		car.drive();
		car.inspect();
	
	}
 
 
 }
 
	 