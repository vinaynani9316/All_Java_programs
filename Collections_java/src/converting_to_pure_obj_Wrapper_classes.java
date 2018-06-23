import java.util.ArrayList;
public class converting_to_pure_obj_Wrapper_classes 
{
	public static void main(String[] args) 
	{
		ArrayList<Comparable> al=new ArrayList<Comparable>();
		al.add(10);    //AutoBoxing
		al.add(new Integer(10));  //Boxing
		al.add(new String("rama")); //Boxing
		al.add(new Character('v'));  //Boxing
		al.add("rama");          //Auto boxing
		System.out.println(al);
		
		
	}

}
