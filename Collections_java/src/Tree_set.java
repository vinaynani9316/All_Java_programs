import java.util.TreeSet;
public class Tree_set 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		System.out.println(t); //it internally follows Balance Binary search tree algorithm i.e, red black algorithm to get efficient comparison.
	}
                               // in case insertions & deletions are more it use internally AVL tree algorithm.
}
