package Java_Hackathon;

import java.util.Scanner;

public class Q12_String_Palindrome {
	public static boolean Palindrome(char[] a)
	{
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			if(a[left]!=a[right])
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.nextLine().toLowerCase();
	sc.close();
	char[]arr=str.toCharArray();
	boolean result=Palindrome(arr);
	if(result)
	{
		System.out.println("String is Palindrome");
	}
	else {
		System.out.println("String is not Palindrome");
	}

	}

}
