package com.Foodiesgo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Dinner {

	public static void dinner() throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
//get connection	
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		String status="dinner";
		String query = "select food_name,price from menu_list where available_at='"+status+"'";
		java.sql.Statement statement = connection.createStatement();
		ResultSet result = ((java.sql.Statement) statement).executeQuery(query);
		String foodName = null;
		int foodPrice  =0;
		while (result.next()) {
			foodName= result.getString("food_name");
			foodPrice= result.getInt("price");
			System.out.println( foodName  +"       "+  foodPrice );
		}
		
}
}
