package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the value of the array:");
		int[]arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("original array:"+Arrays.toString(arr));
		
		for(int i=0;i<size;i++)
		{
			int min_index=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[min_index]>arr[j]) {
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}sc.close();
		System.out.println("Selectio sort:" +Arrays.toString(arr));
	}

}
