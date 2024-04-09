package Java_Hackathon;

import java.util.Scanner;

public class Q_34_Arithmetic_Operation_Using_ADD {
	// we need to flip sign a=(-1)*a
	static int flipSign(int a)
	{	int neg = 0;
	    int tmp = a < 0 ? 1 : -1;
	    while (a != 0)
	    {
	        neg += tmp;
	        a += tmp;
	    }
	    return neg;
	    }
	// Check if a and b are of different signs
	static Boolean areDifferentSign(int a, int b)
	{
    return ((a<0 && b> 0) || (a > 0 && b < 0));
	}
	// subtracion function,// Negating b
	static int sub(int a, int b)
	{
	   return a + flipSign(b);
	}
	static int mul(int a, int b) 
	{  if (a < b) 
	        return mul(b, a); 
	 // Adding a to itself b times 
	    int sum = 0; 
	    for (int i = Math.abs(b); i > 0; i--) 
	    { sum += a; }
	    if (b < 0) 
	    {  sum = flipSign(sum);} 
	 return sum; 
	}
	//Function to divide a by b by counting ,how many times 'b' can be subtracted  
	// from 'a' before getting 0 
	static int division(int a, int b) 
	{  if (b == 0) 
	 { throw new ArithmeticException(); }
	 
	    int quotient = 0, dividend; 
	    int divisor = flipSign(Math.abs(b)); 
	 // Subtracting divisor from dividend 
	    for (dividend = Math.abs(a); dividend >= Math.abs(divisor); 
	         dividend += divisor) 
	        quotient++; 
	// Check if a and b are of similar symbols or not 
	    try {
			if (areDifferentSign(a, b)) 
			    quotient = flipSign(quotient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    return quotient; 
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a :");
		int a=sc.nextInt();
		System.out.println("Enter number b");
		int b=sc.nextInt();
		System.out.println("Subtation is :"+sub(a,b));
		System.out.println("Multiplication is :"+mul(a,b));
		System.out.println("Division is : "+division(a,b));
	}
}