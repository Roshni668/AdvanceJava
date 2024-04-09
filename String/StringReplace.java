package String;

import java.util.Locale;

public class StringReplace {

	public static void main(String[] args) {
		String S= "Dog chases cat,cat chases rat";
		System.out.println(S.replace("cat","rat"));
		
		
		 String str = "Welcome Hello";  
	        System.out.println("Returning words:");  
	        String[] arr = str.split("l",0);  
	        for (String w : arr) {  
	            System.out.println(w);  
	           
	        }  
	}

}
