package Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;
public class Q29_Merge_Sort {

	public static void merge(int a[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	    /* temporary Arrays */  
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	    /* copy data to temp arrays */  
	    for (i = 0; i < n1; i++)    
	    {  LeftArray[i] = a[beg + i]; }   
	    for (j = 0; j < n2; j++)    
	    { RightArray[j] = a[mid + 1 + j]; }  
	    i = 0; /* initial index of first sub-array */  
	    j = 0; /* initial index of second sub-array */   
	    k = beg;  /* initial index of merged sub-array */  
	     while (i < n1 && j < n2)    
	    {    if(LeftArray[i] <= RightArray[j])    
	        {    a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {  a[k] = RightArray[j];    
	            j++;    
	        }   
	    k++;    
	    }    
	    while (i<n1)    
	    {   a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	    while (j<n2)    
	    {   a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }  }    
	  
	public static void mergeSort(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
	    }  
	}  
	  public static void main(String args[])  
	{  
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter array size:");
    	int size = sc.nextInt();
    	int a[] = new int[size];
    	System.out.println("Enter array value: ");
    	for(int i = 0; i < size; i++) {
    		a[i] = sc.nextInt();
    	}
  System.out.println("Before sorting :"+Arrays.toString(a));  
	mergeSort(a, 0, size - 1);  
 System.out.println("After sorting :"+Arrays.toString(a));  

	    System.out.println("");  
		
	}

  


}
