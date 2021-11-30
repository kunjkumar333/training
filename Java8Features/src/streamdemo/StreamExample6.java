package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Java program to Group & Partition Collectors

/* 
 The Collectors class in Java 8 provides methods for grouping and partitioning data stored in collections.
Grouping permits you to organize data that shares a common field value, e.g. department. Partitioning allows
 you to divide the data into two categories, or partitions.
One partition satisfies the partitioning criteria whereas the other partition does not.
For example, we might separate sales data into a partition that met or exceeded a sales goal and a partition that did not.
 */


public class StreamExample6 {

	private static List<MusicalInstrument>musicalInstruments=new ArrayList<>();
	static {
	musicalInstruments.add(new MusicalInstrument("Trumpet","brass",299.99));
	musicalInstruments.add(new MusicalInstrument("Tuba","brass",1149.0));
	musicalInstruments.add(new MusicalInstrument("Timpani","percussion",2339.0));
	musicalInstruments.add(new MusicalInstrument("Snare drum","percussion",325.00));
	musicalInstruments.add(new MusicalInstrument("Piano","keyboard",5179.99));
	musicalInstruments.add(new MusicalInstrument("Trombone","brass",775.79));
	}
	public static void main(String[] args) {
		
		System.out.println("Musical instruments in the collection:");
		musicalInstruments.stream().forEach(instrument->System.out.println(instrument) );
		
		System.out.println("*****************************************************************");
		
		//getting by the type of instrument
		Map<String, List<MusicalInstrument>> typeMap=musicalInstruments.stream().collect(Collectors.groupingBy(MusicalInstrument::getType));
		typeMap.forEach((key, value)-> {System.out.println(key); value.forEach(System.out::println);});
		
		System.out.println("*****************************************************************");
		
		//partition by price
		System.out.println("Partition by Affordable price and Expensive price");
		Map<Boolean, List<MusicalInstrument>> priceMap=  musicalInstruments.stream().collect(Collectors.partitioningBy(mi ->mi.getPrice() > 500.0));
		priceMap.forEach( (key, value)-> {System.out.println((key? "Expensive ":"Affordable")); value.forEach(System.out::println);});
	}	
	}

