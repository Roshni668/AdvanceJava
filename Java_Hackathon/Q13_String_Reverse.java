package Java_Hackathon;

import java.util.Scanner;

public class Q13_String_Reverse {
	public static String reverse(String str)
	{
		StringBuilder rev=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String str1=sc.nextLine();
	String rev1=reverse(str1);
	System.out.println("Reverse String is: "+rev1);
	sc.close();
	}

}
