import java.util.*;
public class Launch1 
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
		l1.add(2,111);
		System.out.println(l1);
		ArrayList<Integer>l3=new ArrayList<Integer>();
		l3.add(1000);
		l3.add(2000);
		l3.add(3000);
		l3.add(4000);
		l3.add(5000);
		System.out.println(l3);
		l1.addAll(4,l3);
		System.out.println(l1);
		l3.clear();
		System.out.println(l3);
		System.out.println(l1.contains(111));
		System.out.println(l2.clone());
		System.out.println(l1.containsAll(l3));
	}

}
