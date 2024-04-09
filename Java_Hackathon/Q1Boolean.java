package Java_Hackathon;
import java.util.Scanner;
public class Q1Boolean {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 1st value:");
	boolean a=sc.nextBoolean();
	
	System.out.println("Enter 2nd value:");
	boolean b=sc.nextBoolean();
	
	System.out.println("Enter 3rd value:");
	boolean c=sc.nextBoolean();
	
	if((a&&b) || (a&&c) || (a&&c))
	{
		System.out.println("At least two of three Boolean are true");
	}
	else
	{
		System.out.println("Less than two boolean are true");
	}
	sc.close();
	
	}

}
