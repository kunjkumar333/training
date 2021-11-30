package newfeatures;
 interface IDemo{
	 void sum(int a,int b);
 }

class Calculation{
	void addition(int a , int b) {
		System.out.println("the addition is:"+(a+b));
	}
}
public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c1=new Calculation ();
		
		//using Lambda expression
		IDemo d1=(a,b) -> System.out.println(": "+(a+b));
          d1.sum(10,40);
          
          //using method referece
          IDemo d2=c1::addition;
          d2.sum(200,150);
	}

}
