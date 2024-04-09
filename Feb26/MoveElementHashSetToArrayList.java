package Feb26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class MoveElementHashSetToArrayList {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(10);
		h.add(8);
		h.add(11);
		h.add(5);
		h.add(2);
		h.add(51);
		System.out.println("\nElement in HashSet :" +h);
		ArrayList<Integer> l=new ArrayList<>(h);
		Collections.sort(l);
		System.out.println("\nElement in ArrayList :"+l);
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Watemelon");
		hs.add("apple");
		hs.add("kiwi");
		hs.add("banana");
		System.out.println("\nElement in HashSet:" +hs);
		ArrayList<String> l1=new ArrayList<>(hs);
		Collections.sort(l1);
		for(String s:l1)
		{
			System.out.println(s);
		}
		System.out.println("\nElement in ArrayList :"+l1);
		
		

	}

}
