package streamdemo;

import java.util.*;
import java.util.stream.Collectors;

//Java program to filter Collection of user defined objects using stream
public class StreamExapmle4 {

	public static void main(String[] args) {

		//Creating list of Books
		List<Book> list=new ArrayList<Book>();
		
		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",15);
		Book b4=new Book(104,"Java Programing","James Gosling","BPB",6);
		
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		//quantity of book greater than 7
		List<Integer> list1=list.stream().filter(i->i.quantity>7).map(i->i.quantity).collect(Collectors.toList());
 System.out.println("Books with quantity greater than 7 is: "+list1);
 
 //each book greater than 7
 list.stream().filter(i->i.quantity>7).forEach(i->System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity));
 
 //total quantity of book
 int qnty=list.stream().map(i->i.quantity).reduce(0,(sum,qty)->sum+qty);
 System.out.println("total qunatity of book are : "+qnty);
 
 //minimum quantity of book 
 Book bkmin=list.stream().min((book1,book2)->book1.quantity>book2.quantity ? 1:-1).get();
 System.out.println("min quantity of book is: "+bkmin.quantity);
 
 //maximum quantity of book
 Book bkmax=list.stream().max((book1,book2)->book1.quantity>book2.quantity ? 1:-1).get();
 System.out.println("max quantity of book is: "+bkmax.quantity);
 
 //count to the total number of book in list
 long count=list.stream().count();
 System.out.println("the total number of book is: "+count);
 
 
 
 
	}

}
