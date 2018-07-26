import java.util.Date;
 
public class GetDateTime
{
      @SuppressWarnings("deprecation")
	public static void main(String args[]) 
      {
           // instance of Date class
           Date date = new Date();
             
           // get date, month and year
           System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()-100));
            
           // get complete date and time
           System.out.println(date.toString());
            
           // get time only
           System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
            
       }
          
}
