import java.util.HashMap;
class Cricket1
{
	String name;
	int runs;
	char gender;
	float average;
	int ph_no;
	public Cricket1(String name, int runs, char gender, float average, int ph_no) //parameterized constructor
	{
		super();
		this.name=name;
		this.runs=runs;
		this.gender=gender;
		this.average=average;
		this.ph_no=ph_no;
	}
	@Override
	public String toString() {
		return "Cricket1 [name=" + name + ", runs=" + runs + ", gender=" + gender + ", average=" + average + ", ph_no="
				+ ph_no + "]";
	}
	public String getName() {   //getters& setters
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public int getPh_no() {
		return ph_no;
	}
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
}
public class Hash_map_key_value_no_order 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Cricket1> h=new HashMap<Integer, Cricket1>(); //creating HashMap object of integer for key & Cricket1 class for complex objects values
        Cricket1 c1=new Cricket1("dhoni",50000,'m',50.5f,123456); // in HashMap must be unique key & may appear duplicate values.
        Cricket1 c2=new Cricket1("virat",60000,'m',60.6f,123467);  
        Cricket1 c3=new Cricket1("sachin",40000,'m',45.6f,456324);
        h.put(10, c1);
		h.put(40, c2);  // unique key for every cricket1 class & may have duplicates in complex objects of Cricket1.
		h.put(17, c3);
		System.out.println(h); // it wont keep order of preserve for both key & Object values
	}

}
