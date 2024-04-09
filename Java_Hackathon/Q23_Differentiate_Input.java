package Java_Hackathon;
import java.util.Scanner;

public class Q23_Differentiate_Input {
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isBoolean(String input) {
		return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		String str = sc.nextLine();
		
		if(isInteger(str)) {
			System.out.println("Value is an Interger");
		} else if(isBoolean(str)) {
			System.out.println("Value is a Boolean");
		} else {
			System.out.println("Value is a String");
		}

	}}
