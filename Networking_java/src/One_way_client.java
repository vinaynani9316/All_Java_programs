import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class One_way_client 
{
	public static void main(String[] args) throws Exception 
	{   
		
		Socket csoc=new Socket("127.0.0.1",8409); // default localHost Internet protocol address & port number
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner scan=new Scanner(System.in); // input from the client
		String temp=scan.nextLine(); 
		dos.writeUTF(temp); //writing to server
	}

}
  
 