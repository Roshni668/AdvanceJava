package Feb21;

public class Child1 extends Parent {

	public static void main(String[] args) {
		// static method directly call methods.
		add(2,3);
		sub(20,10);
		
		//non static method create object then call method.
		Child1 obj=new Child1();
		obj.multiplication(10, 20);
		
	}

}
