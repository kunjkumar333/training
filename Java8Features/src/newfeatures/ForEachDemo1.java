package newfeatures;
import java.util.*;
import java.util.function.Consumer;
//Creating Consumer action
public class ForEachDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("john","mick","nick");
		Consumer<String> convertUpperCase=new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
				
			}
			
		};
		names.forEach(convertUpperCase);
		
		//Cunsumer to display a number
		Consumer<Integer> display=a-> System.out.println(a);
		
		//impliment display using accept
		display.accept(10);

	}

}


