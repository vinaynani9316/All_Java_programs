import java.util.Collections; //using collections class or tree set class in LIST based classes we can sort the objects ascending or descending.
import java.util.ArrayList;                                      //i.e, ArrayList or LinkedList
public class Array_list_sorting_Collections_class 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(80);
		a.add(250);
		a.add(540);
		a.add(94);
		a.add(10);
		a.add(175);
		Collections.sort(a);
		System.out.println(a);
	}

}
