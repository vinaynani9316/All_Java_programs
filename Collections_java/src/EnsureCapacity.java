import java.util.ArrayList;

public class EnsureCapacity 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.ensureCapacity(3);
		al.trimToSize();
		System.out.println(al.size());
	}

}
