package Java_Hackathon;

import java.util.Scanner;

public class Q27_Quick_Sort {
	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }
	// This function takes last element as pivot,
	    // places the pivot element at its correct position
	    // in sorted array, and places all smaller to left
	    // of pivot and all greater elements to right of pivot
	 public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        // Index of smaller element and indicates
	        // the right position of pivot found so far
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	        	// If current element is smaller than the pivot
	            if (arr[j] <= pivot) {
	            	// Increment index of smaller element
	                i++;
	                swap(arr, i, j);
	               }
	        }
	        swap(arr, i + 1, high);
	        return i + 1;
	    }
	 public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter array length:");
	    	int len = sc.nextInt();
	    	int arr1[] = new int[len];
	    	System.out.println("Enter array value: ");
	    	for(int i = 0; i < len; i++) {
	    		arr1[i] = sc.nextInt();
	    	}
	    	quickSort(arr1, 0, len - 1);
	    	System.out.println("Sort :");
	        for (int num : arr1) {
	            System.out.print(num + " ");
	        }
	    }

}
