package com.jdbcsample;

//importing package
import java.sql.*;

/**
 * JDBC SAMPLE PROGRAM BY #bhaskaraacharya
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	String username="root";
    	String password="905906";
    	
    	//get connection to the db
    	Connection bs=DriverManager.getConnection(url,username,password);
    	//a statement to execute a query
    	Statement st=bs.createStatement();
    	//execution of query and storing the response in resultset rs
    	ResultSet rs=st.executeQuery("select * from mobile");
    	//checking for reponse
    	System.out.println("MobileId\tMobileName\tMobilePrice\n");
    	while(rs.next())
    	{
    		String Mobiledata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3);
    		
    		System.out.println(Mobiledata);
    	//reading the mobile name from response

    	//printing mobile name
    	}
    	//closing the connection
    	
    	bs.close();
    	
    	
    	
    	
    }
}
