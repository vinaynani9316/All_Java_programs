import java.util.TreeSet;
public class tress_set
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(50);
		t.add(150);
		t.add(25);
		t.add(175);
		t.add(125);
		t.add(100);   //only once the same value object will print
		System.out.println(t); //it internally follows binary search tree algorithm
		
		
	}

}
