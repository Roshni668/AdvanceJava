package Feb28;

import java.util.HashMap;

public class HashMapWithString {

	public static void main(String[] args) {
		//no duplicate
		//unorder
		//allows null
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("*", "Jnanesh");
		hm.put("ABC", "Raj");
		hm.put("123", "Jay");
		hm.put("null", "Eva");
		hm.put("1", "null");
		hm.put(null, "roshni");
		
		System.out.println(hm.get("*"));
		System.out.println();
		
		for(String value:hm.values())
 	{
			System.out.println(value);
 	}
	}
}
