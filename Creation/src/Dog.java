class Dog 
{
    String name;
    String cost;
    String color;

   
   public static void main(String[] args) 
	
    {
		Dog d1;
		d1 = new Dog();
		
		Dog d2;
		d2=new Dog();
		
		d1.name="pinky";
		d1.cost="1000.5f";
		d1.color="Brown";
		
  System.out.println(d1.name);
  System.out.println(d1.cost);
  System.out.println(d1.color);
  System.out.println();
		
        d2.name="lobo";
        d2.cost="2000;6f";
        d2.color="white";
        
   System.out.println(d2.name);
   System.out.println(d2.cost);
   System.out.println(d2.color);
   
	}

}

