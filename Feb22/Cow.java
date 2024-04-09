package Feb22;

public class Cow implements Animal {

	@Override
	public void makenoise() {
		System.out.println("cow moo");
	}

	@Override
	public void eat() {
		System.out.println("cow eat grass");
		
	}

	public static void main(String[] args) {
		Animal a=new Cat();
		a.makenoise();
		a.eat();
		
		Animal b=new Cow();
		b.makenoise();
		b.eat();
		
		
		
	}
}
