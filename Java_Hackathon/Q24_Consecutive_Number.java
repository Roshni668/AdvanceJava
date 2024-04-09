package Java_Hackathon;

import java.util.Scanner;

public class Q24_Consecutive_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum = 0, j = 0;
		int i;
		
		for(i = 0; i < n; i++) 
		{
			sum = i;
			j = i + 1;
		
		while(sum < n) {
			sum = sum + j;
			j++;
		}
		if(sum == n) 
		{
			for(int k = i; k < j; k++) 
			{
				if(k == i) 
				{
					System.out.print(k);
				} else
				{
					System.out.print(" + "+ k +" ");
				}
		
			}
		}
		
	}
	}
}