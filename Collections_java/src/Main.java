import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop
{
	String name;
	int ram;
	int price;
	 public Laptop(String name, int ram, int price)
	 {
		 this.name=name;
		 this.ram=ram;
		 this.price=price;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}

}
public class Main
{
	public static void main(String[] args) 
	{
		List<Laptop> a=new ArrayList<Laptop>();
		a.add(new Laptop("Dell", 4, 30000));
		a.add(new Laptop("Hp",2, 28000)); 
		a.add(new Laptop("Lenovo", 8, 46000));
		Collections.sort(a, new Comparator<Laptop>()
				{
			            public int compare(Laptop l1, Laptop l2)
			            {
			            	if(((Laptop)(l1)).price>((Laptop)(l2)).price)
			            			{
			            		      return 1;
			            			}
			            	else
			            	{
			            		return -1;
			            	}
			            }
			      
				});
			  System.out.println(a);          	
		
		
	}
}
