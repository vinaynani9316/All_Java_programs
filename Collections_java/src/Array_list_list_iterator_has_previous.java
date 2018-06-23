import java.util.ArrayList;
import java.util.ListIterator;
public class Array_list_list_iterator_has_previous 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(80);
		a.add(15);
		a.add(390);
		a.add(40);
		a.add(200);
		a.add(95);
		ListIterator<Integer> i=a.listIterator(a.size()); // size will come in to consideration to print bottom to top elements for hasPrevious().
		while(i.hasPrevious()==true)
		{
			System.out.println(i.previous());
		}
		
	}

}
