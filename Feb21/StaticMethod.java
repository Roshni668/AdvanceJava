package Feb21;

public class StaticMethod {
	
	public static void add(int i,int j)
	{
		int sum=i+j;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		add(20,30);
		// no need to create object. can call method directly.
		
	}

}
