package String;

public class StringFind {

	public static void main(String[] args) {
		String s="Hello Java 8";
		char[] array=s.toCharArray(); // convert sting into array
		int upper=0,lower=0,number=0;
		for(char c: array)
	{
			if(Character.isUpperCase(c))
			{
				upper++;    // count uppercase character
			}
			else if(Character.isLowerCase(c)) 
			{
				lower++;	// count lowercase character
			}
			else if(Character.isDigit(c))
			{
			number++; 		//count number 
			}
	}
		System.out.println("Uppercase char :" +upper);
		System.out.println("Lowercase char :" +lower);
		System.out.println("Numbers :" +number);
		
		
		
	}

}
