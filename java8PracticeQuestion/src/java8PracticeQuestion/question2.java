package java8PracticeQuestion;

import java.util.ArrayList;
import java.util.List;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(14);
        list.add(5);
        list.add(6);
        list.add(7);
        
        list.stream().map(i->i+" ").filter(i->i.startsWith("1")).forEach(System.out::println);
	}

}
