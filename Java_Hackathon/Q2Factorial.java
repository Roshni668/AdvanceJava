package Java_Hackathon;
import java.util.Scanner;
public class Q2Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
		}
			else
			{
				System.out.println("Factoria is undefine");
			}
		System.out.println("Factorial :" +fact);
		sc.close();
	}

}
