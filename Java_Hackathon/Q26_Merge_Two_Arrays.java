package Java_Hackathon;

import java.util.Arrays;

public class Q26_Merge_Two_Arrays {
public static void merge(int[] a1, int[] a2) {
		
		int m = a1.length -1;
		for(int i = a1.length-1; i >= 0; i--) 
		{	if(a1[i] != 0) 
			{
				a1[m] = a1[i];
				m = m - 1;
			}
		}
		int i = m + 1;
		int j = 0, k = 0;
		while((i < a1.length) && (j < a2.length)) 
		{	if(a1[i] < a2[j]) 
			{
				a1[k++] = a1[i++];
			}
			else 
			{
				a1[k++] = a2[j++];
			}
		}
			while(j < a2.length)
			{
				a1[k++] = a2[j++];
			}
	}
	public static void main(String[] args) {
		
		int arr1[] = {1,2,4,6,9,10,0,0,0,0};
		int arr2[] = {3,5,7,8};
		System.out.println("Array1: "+Arrays.toString(arr1));
		System.out.println("Array1: "+Arrays.toString(arr2));
		merge(arr1,arr2);
	System.out.println("Merged array:"+ Arrays.toString(arr1));
		
		
	}


}
