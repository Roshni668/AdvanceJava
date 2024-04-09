package Java_Hackathon;

import java.util.Scanner;

public class Q18_DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr string");
		String str = sc.nextLine();
		int[] occured = new int[150];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				occured[str.charAt(i)]++;
			}
		}
		for(int j = 0; j < occured.length; j++) {
			if(occured[j] > 1) {
				System.out.println((char)(j) + " is duplicate");
			}
		}
				


	}

}
