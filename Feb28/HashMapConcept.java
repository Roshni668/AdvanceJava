package Feb28;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// unorder 
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	  hm.put(01,"Sunday"); 
	  hm.put(11,"Monday"); 
	  hm.put(15,"Tuesday");
	  hm.put(41,"Wednesday");
	  hm.put(35,"Thurday"); 
	  hm.put(73,"Friday");
	  hm.put(56,"Saturday");
	 
	
	
	System.out.println(hm.get(7));// value at key 7
	System.out.println();
	// all key and value will print
	for(Map.Entry display :hm.entrySet())
	{
		System.out.println(display.getKey()+" "+display.getValue());
	}
	System.out.println();
	// only all value will print
	for(String value:hm.values())
	{
		System.out.println(value);
	}
	// all key will print
	for(Integer key:hm.keySet())
	{
		System.out.println(key);
	}
	}

}
