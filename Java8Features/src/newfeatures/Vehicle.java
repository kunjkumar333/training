package newfeatures;

public interface Vehicle {
	
	//by default it is abstract method
	String getBrand();
	String speedUp();
	String slowDown();
    
	//Any non-abstract methods must be set default
	default String turnAlarmOn()
	{
	return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmOff()
	{
	return "Turning the Vehicle Alarm OFF.";
	}
	
	static int getHorsePower(int rpm,int torque)
	{
	return (rpm*torque)/5252;
	}
}

