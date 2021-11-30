package newfeatures;
import java.util.*;

/* 
 Java lambda expression can be used in the collection framework. It provides efficient
 and concise way to iterate, filter and fetch data.
 */
public class LambdaComparatorDemo {

	public static void main(String[] args) {
		Student s1=new Student(101,"James",80);
		Student s2=new Student(102,"Harry",76);
		Student s3=new Student(103,"David",70);
		Student s4=new Student(104,"John",56);
		Student s5=new Student(105,"Alex",34);
		
		List<Student> list=new ArrayList<Student>();
		
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
		
	System.out.println("Sort Students based on Names");
	
	//implimenting lambda expression to sort user defined objects using
	//Comparator Interface compareTo() method
	
	Collections.sort(list,(st1,st2) ->{ 
		return st1.name.compareTo(st2.name);//wrapper classes are sorted like this which are defined as Doublbe,Integer or String
	});
	
	
	
	for(Student i:list) {
		System.out.println(i.name+" "+i.roll_no+" "+i.marks);
	}
	Collections.sort(list,(st1,st2) ->{
		return st1.roll_no-st2.roll_no; //but non wrapper classes are sorted like this which are int or double
	});
	System.out.println("***********************");
	for(Student i:list) {
		System.out.println(i.name+" "+i.roll_no+" "+i.marks);
	}
	
	Collections.sort(list,(st1,st2) ->{
		return st1.marks.compareTo(st2.marks);
	});
	
	System.out.println("Sorting by marks***********************");
	
		list.forEach(i -> System.out.println(i.name+" "+i.roll_no+" "+i.marks));
		

		Collections.sort(list,(st1,st2) ->{
			return st2.marks.compareTo(st1.marks);
		});
		
		System.out.println("Sorting by marks in decending order***********************");
		
			list.forEach(i -> System.out.println(i.name+" "+i.roll_no+" "+i.marks));
	
		

	}

}
