package newfeatures;

//perform arithmetic operation using lambda
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		Addition sum=(a,b) -> (a+b);	
			System.out.println("Addition of two numbers :" +sum.calculate(200, 155));
			
	
		Addition sub=(n1,n2)-> (n1-n2);	
			System.out.println("subtraction of two numbers :"+sub.calculate(200, 155));
	
		

	}

}
