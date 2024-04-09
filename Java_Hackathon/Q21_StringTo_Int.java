package Java_Hackathon;

import java.util.Scanner;

public class Q21_StringTo_Int {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String str = sc.nextLine();
		sc.close();
	int num=0;
	try {
		num = Integer.parseInt(str);
	} catch(NumberFormatException e) 
	{
	System.out.println("Invalid String");	
	}	
		System.out.println("Integer number: "+num);

	}

}
