package Java_Hackathon;


import java.util.Scanner;

public class Q19_DisplayAllCharacter {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter String");
	    	String str = sc.nextLine();
	    	
	    	int[] occured = new int[128];
	    	for(int i = 0; i < str.length(); i++)
	    	{
	    		if(str.charAt(i) != ' ')
	    		{
	    			occured[str.charAt(i)]++;
	    		}
	    	}
	    	for(int j = 0; j < occured.length; j++) 
	    	{
	    		if(occured[j] != 0) 
	    		{
	    System.out.println((char)(j) + " is occured " + occured[j] + " times");


	}

}}}
