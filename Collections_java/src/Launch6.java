import java.util.ArrayList;
public class Launch6 
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
		l1.add(60);  
		l1.add(80);
		System.out.println(l1);
		l1.set(2, 100);             // set() will remove the particular index element replace with new element.
		System.out.println(l1);
		l1.add(2, 1000);            //add() push the indexed element & add to it.
		System.out.println(l1);                                 
	}

}
