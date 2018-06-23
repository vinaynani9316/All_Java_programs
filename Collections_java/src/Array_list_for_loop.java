import java.util.ArrayList;
public class Array_list_for_loop 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		for(int i = 0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
			a.add(70);  //attempt to structural modification but can't terminate program enters in to infinite loop so we use iterator(). 
		}
		
	}
	
	

}
