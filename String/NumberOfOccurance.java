package String;

public class NumberOfOccurance {

	public static void main(String[] args) {
		String s="I Love Java Programming";
		String s1="o";
		s=s.replace(" ", "");
		System.out.println("New string without space:" +s);
		int i=s.indexOf(s1); //index of 1st o
		int j=s.lastIndexOf(s1); // index of 2nd o
		
		int occurance = (j-i)-1; //number of occurance
		
System.out.println("number of charater between o :"+occurance);
		

	}

}
