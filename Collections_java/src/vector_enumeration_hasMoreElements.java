import java.util.Enumeration;
import java.util.Vector;
public class vector_enumeration_hasMoreElements 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(100);
		v.add(50);
		v.add(35);
		v.add(150);
		v.add(80);
		v.add(120);
		v.add(170);
		Enumeration<Integer> n=v.elements();  //enumeration means keeping elements one after other.
		while(n.hasMoreElements()==true)
		{
			System.out.println(n.nextElement());
		}
		
	}
	
	

}
