package com.jdbcsample;

import java.sql.*;
import java.util.Scanner;
public class addusermobile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	String username="root";
    	String password="905906";
    	Connection bs=DriverManager.getConnection(url,username,password);
    	
    	System.out.println("********Add Your Mobile to DB**********");
    	System.out.println("Enter Mobile Id ");
    	int mid=scan.nextInt();
    	System.out.println("Enter Mobile Name");
    	scan.nextLine();
    	String mname=scan.nextLine();
    	System.out.println("Enter Mobile Price");
		int mprice=scan.nextInt();
		
		String query="insert into mobile values( ?,?,?)";
		
		PreparedStatement pst=bs.prepareStatement(query);
		pst.setInt(1, mid);
		pst.setString(2,mname);
		pst.setInt(3, mprice);
		
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) effected");
		bs.close();
		scan.close();
	}

}
