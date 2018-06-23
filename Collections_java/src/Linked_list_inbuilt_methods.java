import java.util.LinkedList;
public class Linked_list_inbuilt_methods 
{ 
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		System.out.println(l1);
		l1.addFirst(30);
		l1.addFirst(40);
		System.out.println(l1);
		l1.addLast(50);
		l1.addLast(60);
		System.out.println(l1);     //in collections elements are treated as objects only.
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.offerFirst(100);
		System.out.println(l1);
		l1.offerLast(120);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());   // just c0py the elements & print output no effect for elements or object of l1 object.
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast()); // delete the elements & print the output it affect for elements or object of l1 object.
		System.out.println(l1);
		System.out.println(l1.pop());  //same as pollFirst()
		System.out.println(l1);
		l1.push(99);                   //push the element & insert the object in first position
		System.out.println(l1);
	}

}
