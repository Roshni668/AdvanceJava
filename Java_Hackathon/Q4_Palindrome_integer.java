package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_Palindrome_integer {

	public static boolean palindrom(int[] arr)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			if(arr[left]!=arr[right]) 
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter array value");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Value of array:"+Arrays.toString(arr));
		boolean result=palindrom(arr);
		if(result) {
			System.out.println("Array is Palindrom");
		}
		else {
			System.out.println("Array is not Palindrom");
		}
	}
	}


