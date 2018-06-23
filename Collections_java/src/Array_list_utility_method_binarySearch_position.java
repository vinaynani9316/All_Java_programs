import java.util.Collections;
import java.util.ArrayList;
public class Array_list_utility_method_binarySearch_position 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(50);
		a.add(150);
		a.add(25);
		a.add(75);
		a.add(175);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.binarySearch(a,75)); //if the object is it prints location number.
		System.out.println(Collections.binarySearch(a, 180)); // if object doesn't present it prints negative value.
	}

}
