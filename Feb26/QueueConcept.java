package Feb26;
import java.util.LinkedList;

import java.util.Queue;

public class QueueConcept {
	// First in First out
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("Hema");
		q.add("Roshni");
		q.add("Sita");
		q.add("Teena");
		q.add("aarohi");
		int queuesize=q.size();
		
		System.out.println(q.peek());	
		System.out.println();
		for(int i=0;i<queuesize;i++)
		{
		System.out.println(q.poll());	
		}
		
	}


}
