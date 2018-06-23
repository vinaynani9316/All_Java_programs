import java.util.Collections;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class Priority_queue_sort_using_ArrayList 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p=new PriorityQueue<Integer>(); //by default it won't preserve the order of objects & Highest preference will
		p.add(100);                                           // given to lowest value.
		p.add(50);
		p.add(150);
		p.add(25);
		p.add(75);
		p.add(175);
		p.add(86);
		ArrayList<Integer> p1=new ArrayList<Integer>(); // creating ArrayList class to print priorityQueue objects in sorted manner
		p1.addAll(p);   // using addAll() to priorityQueue objects into ArrayList & printing
		Collections.sort(p1);  //sorting in ascending order
		System.out.println(p1);
		Collections.reverse(p1);  //sorting in descending order using reverse()
		System.out.println(p1);
		
	}

}
