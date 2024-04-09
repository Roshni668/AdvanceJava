package Feb21;

public class NonStatic {
	public void add(int i,int j)
	{
		int sum=i+j;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		NonStatic obj=new NonStatic();
		obj.add(10,20);
		
	}

}
