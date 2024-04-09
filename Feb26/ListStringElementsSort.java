package Feb26;

import java.util.ArrayList;
import java.util.Collections;

public class ListStringElementsSort {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Sunday");
		obj.add("Monday");
		obj.add("Friday");
		obj.add("Saturday");
		obj.add("Thursday");
		obj.add("Tuesday");
		//obj.add(null);
		
		
		System.out.println("Before sorting");
		for(String s:obj)
		{
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}

}
