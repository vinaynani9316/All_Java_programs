class Cri
{
	String name;
	int age;
	int runs;
	float avg;
	Cri(String name, int age, int runs, float avg)
	{
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.avg=avg;
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(runs);
		System.out.println(avg);
	}
}
public class Cricketer_with_out_Serialization 
{
	public static void main(String[] args) 
	{
		Cri c=new Cri("Sachin",40,4000,60.5f);  // this is non Serializable, i.e, non persistent(non-permanent) it stores on Ram volatile
		c.disp();                               // to get persistent i.e, non volatile we use interface Serializable in next program.
	}

}
