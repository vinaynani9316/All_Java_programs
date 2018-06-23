import java.util.ArrayList;
public class Launch 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al1=new ArrayList<Comparable>(); // Heterogeneous data & it can store data types as objects in ArrayList
		al1.add(10);
		al1.add(10.5f);
		al1.add('x');
		al1.add("rama");
		al1.add(true);
		al1.add(-7);
		System.out.println(al1);
		
	}

}
