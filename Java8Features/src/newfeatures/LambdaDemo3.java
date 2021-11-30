package newfeatures;

public class LambdaDemo3 {

	public static void main(String[] args) {
	//labmda expresion with single parameter
		MyString msg=(m) ->{return m;};

		System.out.println(msg.myStringFunction("j"));
		
       //lambda expression with reverse of string
		MyString reverse=(m) ->{ 
			String res="";
			for(int i=m.length()-1;i>=0;i--) {
				res=res+m.charAt(i);
			}
			return res;
		};
		System.out.println(reverse.myStringFunction("kunj"));
	}

}
