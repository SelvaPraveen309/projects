package com.Foodiesgo.DAO;
 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Procedurecall {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the food name ");
		String foodname = sc.next();
		System.out.println("price");
		int price = sc.nextInt();
		System.out.println("time");
		String  startingtime= sc.next();
		System.out.println(" enter time");
		String endtime = sc.next();
		System.out.println("available foods");
		String availableat = sc.next();
		System.out.println("enter food types ");
		String typeoffood= sc.next();
	// TODO Auto-generated method stub
		// step 1 DriverManager 
//	Class.forName("com.mysql.jdbc.Driver");
	//step 2 get Connection 
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	String  name = "call pr_add_menu(?,?,?,?,?,?)";
	CallableStatement statement = connection.prepareCall(name);
	statement.setString(1,foodname);
	statement.setInt(2,price);
	statement.setString(3,startingtime);
	statement.setString(4,endtime);
	statement.setString(5,availableat);
	statement.setString(6,typeoffood);
	statement.execute();
	
	

	}

}
