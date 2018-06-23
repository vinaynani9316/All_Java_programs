import java.util.Collections;
import java.util.ArrayList;
public class Array_list_reverse_sort_method 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(1200);
		a.add(65);
		a.add(89);
		a.add(45);
		a.add(79);
		Collections.sort(a);   //sort() will be used only in list based classes
		Collections.reverse(a); // by using reverse() it will sort in descending order of objects
		System.out.println(a);
	}
	
	

}
