package kapil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String dbUrl = "jdbc:mysql://localhost:3306/kapil";  //This URL is based on your IP address
		String username="root"; //Default username is root
		String password="Tester@12345"; //Default password is root
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "Select name from personal_information";

		try 
		{

		Class.forName(dbClass);
		Connection con = DriverManager.getConnection (dbUrl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) 
		{
		String Uname = rs.getString(1);

		System.out.println(Uname);
		} //end while

		con.close();
		} //end try

		catch(ClassNotFoundException e) 
		{
		e.printStackTrace();
		}

		catch(SQLException e) 
		{
		e.printStackTrace();
		}

		}  //end main

		}  //end class
		



