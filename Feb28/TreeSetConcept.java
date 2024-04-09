package Feb28;

import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(8);
	ts.add(6);
	ts.add(5);
	ts.add(0);
	ts.add(4);
	//ts.add(null); not allowed 
	for(Integer num:ts)
	{
		System.out.println(num);
	}
	System.out.println();
	TreeSet<String> ts1=new TreeSet<String>();
	ts1.add("Roshni");
	ts1.add("Patel");
	ts1.add("123");
	ts1.add("Yesha");
	ts1.add("Aarohi");
	for(String str:ts1)
	{
		System.out.println(str);
	}
	}

}
