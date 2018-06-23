import java.util.LinkedHashSet;
import java.util.Iterator;
public class Linked_hash_set_iterator 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		l.add(100);
		l.add(50);
		l.add(150);
		l.add(25);
		l.add(75);
		l.add(125);
		l.add(175);
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
		
	}

}
