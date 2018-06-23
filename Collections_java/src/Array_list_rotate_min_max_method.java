import java.util.Collections;
import java.util.ArrayList;
public class Array_list_rotate_min_max_method 
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
		System.out.println(a);
		Collections.rotate(a, 1);// rotating one object from right to left because distance given is 1.
		System.out.println(a);
		Collections.rotate(a, 2); // rotating two objects from right to left because distance given is 2 & so on depends on distance...
		System.out.println(a);
		System.out.println(Collections.min(a)); // it will print minimum object.
		System.out.println(Collections.max(a)); // it will print maximum object.
		
	}

}
