package Java_Hackathon;

import java.util.Scanner;

public class Q60_Reverse_Algoritham {
public static void reverse(int[] arr, int k) {
		
		int len = arr.length;
		for(int i = 0; i < len; i +=k) {
			int left = i;
			int right = Math.min( i + k -1, len - 1);
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}//[3,2,4,7,0,3,1,5,8, 4] 
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array length: ");
		int l1 = sc.nextInt();
		
		int[] arr1 = new int[l1];
		System.out.println("Enter your array value: ");
		for(int i = 0; i < l1; i++) {
			arr1[i] = sc.nextInt();
		}
	
		reverse(arr1, 3);
		System.out.println("Result: ");
		for(int num : arr1) {
			System.out.print(num + " ");
		}
	}

}
