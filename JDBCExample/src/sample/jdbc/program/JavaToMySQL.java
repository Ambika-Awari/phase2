package sample.jdbc.program;

import java.io.DataInputStream;
import java.sql.*;
import java.util.Scanner;

public class JavaToMySQL 
{
	 
   public static void main(String[] args)
   {
      
	   try{  
		   Class.forName("com.mysql.jdbc.Driver");  
		   Connection con=DriverManager.getConnection(  
		   "jdbc:mysql://localhost:3306/db_world","root","root");  
		
		   Scanner input = new Scanner(System.in);	
           
		   DataInputStream KB=new DataInputStream(System.in);
			//input id
			System.out.print("Enter id: ");
			String id=KB.readLine();
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select * from product where id='"+id+"'");  
		   while(rs.next())  
		   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		   con.close();  
		   }catch(Exception e){ System.out.println(e);}  
		       
   }
}