import java.util.*;
public class Linked_list_iterator_has_next 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(100);
		l.add(50);
		l.add(150);
		l.add(75);
		l.add(125);
		l.add(175);
		l.add(200);
		Iterator<Integer> i=l.listIterator(); //size will not come in to consideration for hasNext().
		{
			while(i.hasNext()==true)
			{
				System.out.println(i.next());
			}
		}
		
	}

}
