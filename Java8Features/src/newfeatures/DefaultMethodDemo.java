package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		Vehicle car=new Car("BMW");
		
		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
	     //invoke default methods
		System.out.println(car.turnAlarmOn());	
		System.out.println(car.turnAlarmOff());
		
		//invoked static method of interface
		System.out.println(Vehicle.getHorsePower(2500,400));

	}

}
