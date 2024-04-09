package Feb28;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		//follow insertion order
		//allow null
		//no duplicate
		
	LinkedHashMap<Integer,String> obj=new LinkedHashMap<Integer,String>();
		obj.put(null,"thursday");    
		obj.put(13,"saturday");
	    obj.put(21,"Friday");
	    obj.put(60,"Tuesday");
		obj.put(11,"Sunday");
		obj.put(55,"Monday");
		obj.put(39,"Wednesday");
		
		
		
		System.out.println(obj.get(3));
		System.out.println();
	for(Map.Entry display:obj.entrySet())
	{
		System.out.println(display.getKey()+" "+display.getValue());
	}
	}

}
