import java.util.TreeSet;
import java.util.Iterator;
public class Tree_set_decending_iterator 
{
	public static void main(String[] args) 
	{ 
		TreeSet<Integer> t=new TreeSet<Integer>(); //TreeSet class uses binary search tree algorithm because it is unsorted. 
		t.add(100);
		t.add(75);
		t.add(48);
		t.add(60);
		t.add(90);
		t.add(112);
		t.add(560);
		t.add(3);
		Iterator<Integer> i=t.descendingIterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());  
		}
		
	}

}
