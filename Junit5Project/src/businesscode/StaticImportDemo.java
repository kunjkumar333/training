package businesscode;
import static java.lang.Math.*;
public class StaticImportDemo {

	
	//In Java, static import concept is introduced in 1.5 version. With the help of static import, 
	//we can access the static members of a class directly without class name or any object.
	public static void main(String[] args) {

         //without static import
		System.out.println(Math.abs(10.22));
		System.out.println(Math.sqrt(13));
		System.out.println(Math.pow(10,2));
		
		//with static import
		System.out.println(abs(10.22));
		System.out.println(sqrt(13));
		System.out.println(pow(10,2));
	}

}
