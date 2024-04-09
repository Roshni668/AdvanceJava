package Feb22;

public class Telecom extends Reliance{

	public static void main(String[] args) {
		Reliance rel;
		rel=new Telecom();
		rel.profit();
		rel=new Retail();
		rel.profit();
		rel.inventory();
		rel.corevalue();

	}

	@Override
	void profit() {
		System.out.println("this will be telecom profit");
	}

	@Override
	void inventory() {
		
	}

}
