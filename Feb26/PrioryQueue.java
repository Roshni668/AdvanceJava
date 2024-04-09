package Feb26;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioryQueue {

	public static void main(String[] args) {
		Queue <Object> q= new PriorityQueue<Object>();
		q.add("321 street");
		q.add("banana");
		q.add("watermelon");
		q.add("kiwi");
		q.add("123 lane");
		
		//int qsize=q.size();
		for(Object data: q)
			{System.out.println(data);}
		}
	//for(int i=0;i<qsize;i++)
	{
		//System.out.println(q.poll());
	}

}
