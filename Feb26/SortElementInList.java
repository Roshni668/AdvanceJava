package Feb26;

import java.util.ArrayList;
import java.util.*;
public class SortElementInList {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(5);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		obj.add(4);
		System.out.println("List before sort");
		for(Integer num: obj)
		{
			System.out.println(num);
			
		}
		Collections.sort(obj);
		System.out.println();
		System.out.println("List after sort");
		for(Integer num: obj)
		{
			System.out.println(num);
		}		
		
	
	}

}
