package Feb28;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {
		//unorder,duplicate not allowed, 
	//can not acess data with index
		
	HashSet<Integer> hs=new HashSet<Integer>();	
	hs.add(10);
	hs.add(9);
	hs.add(13);
	hs.add(20);
	hs.add(15);
	hs.add(20);
	
	for(Integer num:hs)
	{
		System.out.println(num);
	}
	System.out.println();
	HashSet<String> s=new HashSet<String>();
	s.add("apple");
	s.add("pineapple");
	s.add("kiwi");
	s.add("berry");
	
	s.add(null);
	for(String str:s)
	{
		System.out.println(str);
	}
	}

}
