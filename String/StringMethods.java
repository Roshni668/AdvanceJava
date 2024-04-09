package String;

public class StringMethods {

	public static void main(String[] args) {
		String s="Hello World";
		String s1="Welcome TO Java Program";
		System.out.println("length :"+ s.length());
		System.out.println("Uppercase :"+s.toUpperCase());
		System.out.println("Lowercase :"+s.toLowerCase());
		System.out.println("Empty :" +s.isEmpty());
		System.out.println("Contains :"+s.contains("Hello"));
		System.out.println("contains :" +s.contains("hello"));
		System.out.println("compare :" +s.compareTo(s1));
		System.out.println("Start with :"+ s1.startsWith("Welcome"));
		System.out.println("Ends with :" +s1.endsWith("Program"));
		System.out.println("char at position :"+s.charAt(6));
		System.out.println("sub string:" +s1.substring(1,10));
		System.out.println("Replace :"+s.replace("Hello", "Java"));
		System.out.println("concat two string:"+s.concat(s1));
		StringBuilder s3=new StringBuilder("My computer ");
		s3.append("Hp");
		System.out.println("Append: "+s3);
		
	
	
		
	}
}
