package Feb23;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try 
		{
		 int c=a/b;
		 System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("numbe can not be divisible"+e.getMessage());
		}

	}

}
