package java8PracticeQuestion;

import java.util.ArrayList;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(23);
        list.add(7);
        
        list.stream().sorted().forEach(System.out::println);;

	}

}
