package Feb26;
import java.util.Stack;
public class StackConcept {

	public static void main(String[] args) {
		//string stack
		Stack<String> stk=new Stack<String>();
		 
		 stk.add("Hema");   // Last in first out
		 stk.add("Sita");
		 stk.add("teena");
		 stk.add("Sujatha"); 
		 stk.push("Prajwal");
		
		 
		 int stksize=stk.size();
		 for(int i=0;i<stksize;i++)
		 {
			 System.out.println(stk.pop());
		 }
		 System.out.println();
		 // integer,string,float stack
		 Stack<Object> i=new Stack<Object>();
		 i.push(1);
		 i.add(2.5);
		 i.add(52.66);
		 i.add("Roshni");
		 i.add("Patel");
		//i.remove(2);
		 
		 int isize=i.size();
		 for(int j=0;j<isize;j++)
		 {
			 System.out.println(i.pop());
		 }
		 
	}

}
