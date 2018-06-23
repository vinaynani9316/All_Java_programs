import java.util.TreeSet;
public class Tree_set_inbuilt 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(50);
		t.add(150);
		t.add(25);
		t.add(75);
		t.add(125);
		t.add(175);
		System.out.println(t);
		System.out.println(t.headSet(100));
		System.out.println(t.tailSet(100));
		System.out.println(t.ceiling(115));
		System.out.println(t.ceiling(125));
		System.out.println(t.higher(115));
		System.out.println(t.higher(125));
		System.out.println(t.floor(60));
		System.out.println(t.floor(50));
		System.out.println(t.lower(60));
		System.out.println(t.lower(50));
		System.out.println(t.first());
		System.out.println(t.last());
		
		
	}

}
