package Feb22;

public class FinalizeConcept {
	

		public static void main(String[] args) {
			
			FinalizeConcept fin=new FinalizeConcept();
			fin=null;
			System.gc();
			System.out.println(fin);
		}
		protected void finalize()
		{
			System.out.println("i am in finalize method");
		}
}
