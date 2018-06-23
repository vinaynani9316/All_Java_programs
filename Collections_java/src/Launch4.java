import java.util.ArrayList;
public class Launch4 
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
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(70);
		l2.add(30);
		l2.add(80);
		l2.add(90);
		l2.add(30);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println(l1);
		System.out.println(l1.remove(2)); //print the removed element
		System.out.println(l1);
		l1.remove(1);                    //print except removed element
		System.out.println(l1);
		
	}

}
