package Java_Hackathon;

import java.util.Scanner;

public class Q20_Repeated_Character {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();

	        int[] occured = new int[128];

	        for (int i = 0; i < str.length(); i++) 
	        {  if (str.charAt(i) != ' ') {
	                occured[str.charAt(i)]++;
	            }
	        }

	        System.out.println("Repeated digits:");
	        for (int j = 48; j <= 57; j++) {
	            if (occured[j] > 1) {
	                System.out.println((char) j + " is repeated " + occured[j] + " times");
	            }
	        }

	        System.out.println("Uppercase characters:");
	        for (int j = 65; j <= 90; j++) {
	            if (occured[j] > 1) {
	                System.out.println((char) j + " is repeated " + occured[j] + " times");
	            }
	        }

	        System.out.println("Lowercase characters:");
	        for (int j = 97; j <= 122; j++) {
	            if (occured[j] > 1) {
	                System.out.println((char) j + " is repeated " + occured[j] + " times");
	            }
	        }

	}

}
