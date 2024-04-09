package Java_Hackathon;

import java.util.Arrays;

public class Q32_MergeA_B_Array {

	public static void merge(int[] a, int[] b) {
		int m = a.length-1;
		
		for(int i = a.length-1; i >= 0; i--) {
			if(a[i] != 0) {
				a[m] = a[i];
				m = m-1;
			}
		}
		int i = m + 1;
		int j = 0;
		int k = 0;
		
		while ((i < a.length) && (j < b.length)) {
			if(a[i] < b[j]) {
				a[k++] = a[i++];
			} else {
				a[k++] = b[j++];
			}
		}
		while (i < a.length) {
			a[k++] = a[i++];
		}
		while (j < b.length) {
			b[k++] = b[j++];
		}
	}
	
	public static void main(String[] args) {

		int[] A = {3,5,7,0,0,0};
		int[] B = {2,4,6};
		merge(A,B);
		System.out.println("Sorted array: " + Arrays.toString(A));
	}


}
