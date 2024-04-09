package Java_Hackathon;

import java.util.Scanner;

public class Q17_Total_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		int number=0;
		int uppercase=0;
		int lowercase=0;
		for(char ch:str.toCharArray()) {
			if(Character.isDigit(ch)) 
			{
				number++;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
		}
		System.out.println("Total integer number :" +number);
		System.out.println("Total uppercase :"+uppercase);
		System.out.println("Total lower case :"+lowercase);
		sc.close();
	}

}
