import java.util.Collections;
import java.util.ArrayList; 
import java.util.Comparator;  // here we use Comparator class
public class Array_list_sort_ReverseOrder_method 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(200);
		a.add(000);
		a.add(-20);
		a.add(98);
		a.add(482);
		a.add(567);
		a.add(043);
		Comparator<Integer> c=Collections.reverseOrder();  // using reverseOrder()
		Collections.sort(a, c); // list, comparator reference
		System.out.println(a);
	}

}
