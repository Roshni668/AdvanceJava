package Java_Hackathon;

import java.util.Scanner;

public class Q14_Word_Reverse {
public static String reverse(String input) {
		
		String[] words = input.split(" ");
		String reverseString = "";
		
		for(int i=words.length-1;i>=0;i--) {
			reverseString = reverseString +words[i] +" ";
		}
		return reverseString;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		sc.close();
		String output = reverse(str);
		System.out.print("\nRevrese String :"+output);
	}

}

