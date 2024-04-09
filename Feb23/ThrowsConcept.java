package Feb23;

public class ThrowsConcept {

	public int dividenumber(int a,int b) throws ArithmeticException{
		int div=a/b;
		return div;
	} 
	public static void main(String[] args) {
		ThrowsConcept obj=new ThrowsConcept();
		try {
			System.out.println(obj.dividenumber(10, 0)); 
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("number can not divide by zero");
		}
	
	}

}
