package Feb26;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMixElementSort {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("10");
		obj.add("Watermelon");
		obj.add("Apple");
		obj.add("15");
		obj.add("12");
		obj.add("Banana");
		System.out.println("Before sorting");
		for(Object data:obj)
		{
			System.out.println(data);
		}
		System.out.println();
		Collections.sort(obj);
		System.out.println("After sorting");
		for(Object data:obj)
		{
			System.out.println(data);
		}
	}

}
