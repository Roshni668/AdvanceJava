package Feb28;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
//key is constant
	//sorted map
	//it will sort key
	//null key not allowed
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("N","Sunday");
		tm.put("D","Tueday");
		tm.put("A","Saturday");
		tm.put("H","Monday");
		tm.put("Q",null);
		tm.put("P","Wednesday");
		
		System.out.println(tm.containsValue("Sunday"));
		System.out.println();
		System.out.println(tm.get("A"));
		System.out.println();
		for(Map.Entry display:tm.entrySet())
		{
		System.out.println(display.getKey()+" "+display.getValue());	
		}
		
	}

}
