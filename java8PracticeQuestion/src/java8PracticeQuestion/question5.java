package java8PracticeQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class question5 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(13);
        list.add(27);
        list.add(7);
        
        Integer maximum=list.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println("max is : "+maximum);
        
        Integer minimum=list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println("min is: "+minimum);
 
        long res= list.stream().count();
        
        Integer sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum is: "+sum);
 
       System.out.println("Average is: "+(double)sum/res);
      
	}

}
