package Java_Hackathon;

import java.util.Scanner;

public class Q22_Int_to_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		sc.close();
		String str = Integer.toString(num);
		System.out.println("After convert: " + str);


	}

}
