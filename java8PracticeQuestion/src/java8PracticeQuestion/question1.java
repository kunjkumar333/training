package java8PracticeQuestion;

import java.util.*;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(411);
        list.add(5);
        list.add(6);
        list.add(7);
        
        list.stream().filter(i-> i%2==0).forEach(i->System.out.println(i));
       // list.stream().filter(i-> i%10==1).forEach(i->System.out.println(i));
        }

}
