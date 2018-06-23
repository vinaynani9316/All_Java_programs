import java.util.ArrayList;
import java.util.Iterator;
public class Array_list_iterator_fail_fast 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
			a.add(70); //attempt for structural modification through iterator() will terminate using fail fast. with exception concurrent class.
		}
	}

}
