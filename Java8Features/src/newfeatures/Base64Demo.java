package newfeatures;

import java.util.Base64;
import java.util.Scanner;
public class Base64Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String U_name,password;
		
		System.out.println("******* Welcome to Coforge Technologies********");
		System.out.println("Enter your User Name");
		U_name=sc.next();
		
		System.out.println("Enter Your Password");
		password=sc.next();
		String cnf_pass=password;
		
		//Encoding the String to Base6 format
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		
		
		System.out.println("Login Successfull!");
		System.out.println("user name :"+U_name);
		System.out.println("Passwrod :"+encodedPassword);
		
		System.out.println("******decoding pass*******");
		String  decodedPass= new String(Base64.getDecoder().decode(encodedPassword));
		System.out.println(decodedPass.toString());
		
		System.out.println("**********encoding using url*****");
		Base64.Encoder encoder=Base64.getUrlEncoder();
		String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		System.out.println("Encoded Url is: "+eUrl);
	}

}
