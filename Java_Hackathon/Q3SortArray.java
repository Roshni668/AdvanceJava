package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3SortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the value of the array:");
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
		sc.close();
	}

}
