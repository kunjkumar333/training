package newfeatures;

import java.time.LocalDate;

interface Parser{
	default void parse(){
		System.out.println("default Parsing logic");
	}
	
	static void displayDate() {
		System.out.println(LocalDate.now());
	}
}
class TextParser implements Parser{

	//inherit default implementation of parse
	public void display() {
		// TODO Auto-generated method stub
		
	}
	//inherit default implementation of Parse
}

class XMLParser implements Parser{
	//overriden
	public void parse(){
		System.out.println("Parsign XML files");
	}
}
public class DefaultMethodDemo2 {

	
	public static void main(String[] args) {
		
		Parser p=new TextParser(); //Up casting
		p.parse();//invokes default method
		
		TextParser p1=new TextParser();
		p1.display();
		
		p=new XMLParser(); //refrence child class
		p.parse(); //invokes overriden method
		
		System.out.println("Program to execute at:");
		Parser.displayDate(); //invoke static method
		

	}

}
