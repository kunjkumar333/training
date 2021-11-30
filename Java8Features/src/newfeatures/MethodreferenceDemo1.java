package newfeatures;
//Method reference - Shorthand of lambda expression to call method
@FunctionalInterface
interface MyInterface{
	void myMethod();
}
class Test{  //instance class
	void display() {  //instance method
		System.out.println("I am a Instance Method");
	}
}
public class MethodreferenceDemo1 {

	public static void main(String[] args) {

Test t1=new Test();
t1.display();

//java8 method reference approach 
MyInterface mref=t1::display; //method reference to instance method of object

//calling method of functional interface
mref.myMethod();

	}

}
