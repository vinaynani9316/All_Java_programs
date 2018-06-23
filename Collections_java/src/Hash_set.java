import java.util.HashSet;
public class Hash_set 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(100);
		h.add(50);
		h.add(150);
		h.add(25);
		h.add(200);
		h.add(125);
		h.add(75);
		System.out.println(h); //preserve the order of insertion internally follows heap data structure. 
	}

}
