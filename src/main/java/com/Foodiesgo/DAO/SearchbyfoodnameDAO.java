package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Foodiesgo.model.Fooditems;

public class SearchbyfoodnameDAO {
	public static Fooditems findUsingName(String name) throws Exception
	{
		Fooditems fooditem=new Fooditems();
		Connection connection=Connectionutil.databaseConnection();	
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select food_name,price from menu_list where food_name=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, name);
		result=statement.executeQuery();
		String foodName=null;
		int price=0;
		if(result.next())
		{
			foodName=result.getString("food_name");
			price=result.getInt("price");
			fooditem.setFoodname(foodName);
			fooditem.setPrice(price);
			
		}
		return fooditem;
	}

}
