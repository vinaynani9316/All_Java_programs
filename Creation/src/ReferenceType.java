class ReferenceType
	{
	String color;
	String cost;
	String numofwings;
	
  public static void main(String[]args)
  {
	  ReferenceType f1;
      f1= new ReferenceType();
      
	  f1.color="blue";
	  f1.cost="1000";
	  f1.numofwings="3";
	  
System.out.println(f1.color);
System.out.println(f1.cost);
System.out.println(f1.numofwings);
    
      ReferenceType f2;
      f2=f1;
      f2.color="green";
      f2.cost="2000";
      f2.numofwings="4";
      
 System.out.println(f1.color);  
 System.out.println(f1.cost);
 System.out.println(f1.numofwings);
 System.out.println();  
 System.out.println(f2.color);
 System.out.println(f2.cost);
 System.out.println(f2.numofwings);
 
      ReferenceType f3;
      f3=f1;
      f3.color="red";
      f3.cost="3000";
      f3.numofwings="5";
      
 System.out.println(f1.color);
 System.out.println(f1.cost);
 System.out.println(f1.numofwings); 
 System.out.println();  
 System.out.println(f2.color);
 System.out.println(f2.cost);
 System.out.println(f2.numofwings);  
 System.out.println();  
 System.out.println(f3.color);
 System.out.println(f3.cost);
 System.out.println(f3.numofwings);  
 
        }
	}
	
		
	
	


