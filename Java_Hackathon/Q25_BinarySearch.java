package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q25_BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int i;
    	int arr[] = new int[5];
    	System.out.println("Enter 5 array values: ");
    	
    	for(i = 0; i < 5; i++) 
    	{
    		arr[i] = sc.nextInt();
    		}
    	System.out.println("Entered array: " + Arrays.toString(arr));
    		Arrays.sort(arr);
    		System.out.println("sorted array: " + Arrays.toString(arr));
    		
    		System.out.println("Enter the element to search: ");
    		int key = sc.nextInt();
    		
    		int t = Arrays.binarySearch(arr, key);
    		
    		if(t >= 0) {
    			System.out.println(key + " found at index " + t);
    		} else {
    			System.out.println(key + " not found");
    		
    		}
    	}


	}


