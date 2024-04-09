package Feb22;

public class FinallyConcept {

	public static void main(String[] args) {
		try {
		int [] array=new int[5];
		System.out.println(array[6]);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Test compeleted");
		}
		System.out.println();

		try {
			int a=10;
			int b=0;
			int sum =a/b;
			System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Program compeleted");
		}
		}
	}


