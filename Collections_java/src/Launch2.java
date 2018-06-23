import java.util.ArrayList;
public class Launch2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.ensureCapacity(5);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(0);
		l1.add(80);
		l1.add(60);   //ensureCapacity no more considered in collections ArrayList it comes in Arrays
	    System.out.println(l1.size());
		l1.trimToSize();
		
	}

}
