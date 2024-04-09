package Feb26;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	//method to removeuplicate
	static void remove(String str)
	 {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		//Add each character of the string into LinkedHashSet   
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		 // print the string after removing duplicate characters   
		for(Character ch:set)
		{
			System.out.print(ch);
		}
	 }
	public static void main(String[] args) {
		String str="Hello Java Programming,I Love Selenium";
		// before removing duplicate
		for(int i=0;i<str.length();i++)
		{
		}System.out.println(str);
		remove(str);
		 
		 
	}

}
