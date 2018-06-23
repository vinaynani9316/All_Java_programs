import java.util.ArrayList;
public class Launch5
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		
	}

}
