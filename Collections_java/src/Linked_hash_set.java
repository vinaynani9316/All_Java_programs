import java.util.LinkedHashSet;
public class Linked_hash_set 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		l.add(100);
		l.add(50);
		l.add(150);
		l.add(25);
		l.add(200);
		l.add(125);
		System.out.println(l); // it doesn't preserve the order of insertion how ever we give input it preserve as it is.
	}

}
