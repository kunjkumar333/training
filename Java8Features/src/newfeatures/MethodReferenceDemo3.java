package newfeatures;
import java.util.*;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		Order order1=new Order(170,"coforge",211.12,Order.Side.BUY);

		Order order2=new Order(150,"ss.com",123.16,Order.Side.SELL);
		
		List<Order> orderBook=new ArrayList<Order>();
		
		orderBook.add(order1);
		orderBook.add(order2);
		
		//sort all based on lambda expresion
		System.out.println("before sorting"+orderBook);
		
		Collections.sort(orderBook,(a,b) -> Order.compareByQuantity(a, b));
		System.out.println("after sorting :"+orderBook);
		
		//sort using method reference by calling static method
		Collections.sort(orderBook,Order::compareByQuantity);
		System.out.println(orderBook);
		
		//sort using method reference by calling instance method
		Order order=orderBook.get(0); //we require reference of object
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("order Book after Sorting by Price:" +orderBook);

	}

}
