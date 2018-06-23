import java.util.ArrayList;
import java.util.Collections; //Heterogeneous data for collections class leads to class cast exception.
public class Array_list_colletions_heterogenous 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(120);		
		a.add(80);
		a.add(190);
		a.add("Vinay");
		a.add('x');
		Collections.sort(a);
		System.out.println(a);
	}

}
