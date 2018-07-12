import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Two_way_server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket listner=new ServerSocket(6943);
		System.out.println("server is ready to accept the request ");
		
		Socket ssoc=listner.accept();     //establishing connection.
		
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		
		OutputStream os=ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os); 
		
		String temp1=dis.readUTF();
		System.out.println(temp1);      //accepting from client
		
		Scanner scan=new Scanner(System.in);
		String temp2=scan.nextLine();
		dos.writeUTF(temp2);           //sending to client
	}

}
