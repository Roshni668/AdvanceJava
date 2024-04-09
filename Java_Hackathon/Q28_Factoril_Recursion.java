
package Java_Hackathon;

import java.util.Scanner;

public class Q28_Factoril_Recursion 
{
	public static int fact(int num)
	{
		if(num == 1) 
		{
			return 1;
		}
		return num * fact(num-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int n = sc.nextInt();
		int result = fact(n);
		System.out.println("Factorial of number: "+result);
		sc.close();
	}
}
