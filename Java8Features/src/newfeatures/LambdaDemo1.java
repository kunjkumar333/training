package newfeatures;

@FunctionalInterface
interface MyFI{
	public String sayHello();
	//public int number();
}
public class LambdaDemo1 {

	public static void main(String[] args) {

    MyFI msg=()->{ return "hello World";};
   
    
    System.out.println(msg.sayHello());

	}

}
