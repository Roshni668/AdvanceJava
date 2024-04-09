package Java_Hackathon;

import java.util.Scanner;

public class Q30_Longest_Palindrome {
public static String getLongestPelindrom(String input) {
		int rightIndex =0, lefttIndex =0;
		String currentPalindrom = "", longestPalindrom = "";
		for(int centerIndex = 1; centerIndex < input.length()-1; centerIndex++) {
			lefttIndex = centerIndex - 1;
			rightIndex = centerIndex + 1;
			while (lefttIndex >= 0 && rightIndex < input.length()) {
				if(input.charAt(lefttIndex) != input.charAt(rightIndex)) {
					break;
				}
				currentPalindrom = input.substring(lefttIndex, rightIndex+1);
longestPalindrom = currentPalindrom.length() > longestPalindrom.length() ? currentPalindrom : longestPalindrom;
				lefttIndex--;
				rightIndex++;
			}
		}
		return longestPalindrom;
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String longestPeli = getLongestPelindrom(str);
		System.out.println("Longest palindrom is: " +  longestPeli);
	}

}
