
package Feb26;

import java.util.ArrayList;

public class ListConcept {

	public static void main(String[] args) {
		
		  ArrayList<String> arraylist=new ArrayList<String>();
		  arraylist.add("roshni");
		  arraylist.add("patel");
		  arraylist.add("aarohi"); 
		  arraylist.add("harnish");
		  arraylist.add("pankti");
		 
		  for(Object data :arraylist)
		  {
			  System.out.println(data);
		  }
	}

}
