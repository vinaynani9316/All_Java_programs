import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 public class Get_result extends HttpServlet
 {
	 
	 public void doGet(HttpServletRequest x, HttpServletResponse y) throws IOException,ServletException
	 {
		 try
		 {
			 
			 Connection con=null;
			 String url="jdbc:mysql://127.0.1:3306/test";
			 String un="root";
			 String pw="root";
			 PreparedStatement pstmt=null;
			 ResultSet res=null;
		
			 String a=null;
			 con=DriverManager.getConnection(url,un,pw);
			 pstmt=con.prepareStatement("select* from employees WHERE empid=1");
			 String temp=x.getParameter("empid");
			 pstmt.setString(1,temp);
			 res=pstmt.executeQuery();
			 while(res.next()==true)
			 {
				a=res.getString(1);
				PrintWriter p1=y.getWriter();
				p1.println(a);
			 }
			 res.close();
			 pstmt.close();
			 con.close();
		 }
			 catch(SQLException e)
			 {
				 e.printStackTrace();
			 }
	 }
	 }
	
			
