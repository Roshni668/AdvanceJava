package Feb23;

public class ThrowExceptionConcept {
	
	public void checknum(int num) {
		if(num<1)
		{
			throw new ArithmeticException("number is negative");
		}
		else
		{
			System.out.println("this number "+ num +" is positive");
		}
	}

	public static void main(String[] args) {
		ThrowExceptionConcept obj= new ThrowExceptionConcept();
		obj.checknum(-1);

	}

}
