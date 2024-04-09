package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_Find {
	public static void findout(int s,int [] a){
		Arrays.sort(a);
		for(int i=0;i<s;i++)
		{  int count=1;
			for(int j=i+1;j<s;j++)
			{
				if(a[j]==a[j-1])
				{ count++;
					i++;
				}
				else 
				{  
					break; }
				}
			if(count==1) 
			{
			System.out.println(a[i] + "is unique number");	
			}
			else
			{
				System.out.println("Occurance of " +a[i]+ " is "+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter array value:");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Arrays.toString(arr)");
		findout(size,arr);
		sc.close();
		

}

}
