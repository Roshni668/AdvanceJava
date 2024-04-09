package Java_Hackathon;

import java.util.Scanner;

public class Q_16_Remove_Character {
	public static String removeChar(String str, char charToRemove) {
		
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(c != charToRemove) {
				result.append(c);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str1 = sc.nextLine();
	System.out.println("Enter the character you want to remove:");
		char rem = sc.next().charAt(0);
		
		String result = removeChar(str1, rem);
		System.out.println("After remove the charcter: " + result);
		sc.close();
		}
	}


