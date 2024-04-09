package String;

public class StringReverse {

	public static void main(String[] args) {
		String s="JAVA";
		String s1=""; //new String for reverse string 
		char ch;     
		System.out.println("Original String :"+s);
	//	System.out.println(reverse);
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i); //extract each character
			s1=ch+s1; 		//add character infront of string
		}
		System.out.println("Reverse String :"+s1);
	}

}
