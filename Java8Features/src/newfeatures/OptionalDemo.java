package newfeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s=null;
//		System.out.println(s.length()); //throw nullpointerexception
		String k=null;
		//optional object is a container for not null objects
		//it will handle NullPointerException
		Optional<String> chkNull=Optional.ofNullable(k);
		
		if(chkNull.isPresent()) {
			System.out.println("Length of String is :"+k.length());
			
		}
		else
		{
			System.out.println("String not Present");
		}

	}

}
