import java.util.ArrayList;
public class Launch3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		System.out.println(l1.get(4));
		System.out.println(l1.getClass());
		System.out.println(l1.hashCode());
		System.out.println(l1.indexOf(30));
		System.out.println(l1.lastIndexOf(30));
		System.out.println(l1.isEmpty());
		l1.clear();
		System.out.println(l1.isEmpty());
		
	}

}
