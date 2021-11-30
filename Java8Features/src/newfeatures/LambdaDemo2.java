package newfeatures;

public class LambdaDemo2 {

	public static void main(String[] args) {

  NumericTest isEven=(n)-> (n%2==0);
  NumericTest isNegative=(n)-> (n<0);
  
  System.out.println(isEven.compute(10));
  System.out.println(isNegative.compute(4));
  
//  boolean a=(n) -> (n%2==0); //error--lambda expression should be stored in instance of FI

	}

}
