package Feb28;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
	
	LinkedHashSet<Integer> ob=new LinkedHashSet<Integer>();
	ob.add(1);
	ob.add(9);
	ob.add(5);
	ob.add(10);
	
	for(Integer num:ob)
	{
		System.out.println(num);
	}
	System.out.println();
	LinkedHashSet<String> str=new LinkedHashSet<String>();	
	str.add("apple");
	str.add("banana");
	str.add("kiwi");
	str.add(null);
	str.add(null);
	str.add("apple");
	str.add("pineapple");
	
	for(String s:str)
	{
		System.out.println(s);
	}
	
	
	
	}

}
