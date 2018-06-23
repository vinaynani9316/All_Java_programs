import java.util.concurrent.CopyOnWriteArrayList;//we must use concurrent package to fail last & allow to program successfully without exception
import java.util.Iterator;
public class Array_list_concurrent_package 
{
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<Integer>();
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(250);
		c.add(70);
		c.add(80);
		c.add(100);
		Iterator<Integer > i=c.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
			c.add(90);//attempt to structural modification & it prevent using fail state & program run successfully.
		}
		
		
	}

}
