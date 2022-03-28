package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalTime;

import com.Foodiesgo.model.Fooditems;

public class FoodItemsDAO {
	 public static void foodinsertion(Fooditems fooditem) throws Exception {
		 Connection connection=Connectionutil.databaseConnection();
		 PreparedStatement statement=null;
		 String query="insert into menu_list(food_name,price,starting_time,end_time,available_at,type_of_items)values(?,?,?,?,?,?)";
		 statement=connection.prepareStatement(query);
		 statement.setString(1,fooditem.getFoodname());
		 statement.setInt(2,fooditem.getPrice());
//		 statement.setLocalTime(1,fooditem.getStartingtime());
//		 statement.setLocalTime(1,fooditem.getEndingtime());
		 statement.setString(1,fooditem.getAvailable());
		 statement.setString(1,fooditem.getFoodstyle());
		 
	 }
}   