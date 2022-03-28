package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class FoodPriceFinder {
	public static int priceFinder(int id) throws Exception
	{
		Connection connection=Connectionutil.databaseConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select price from menu_list where id=?";
		statement=connection.prepareStatement(query);
		statement.setInt(1, id);
		result=statement.executeQuery();
		int price=0;
		if(result.next())
		{
			price=result.getInt("price");
		}
		return price;
		
	}

}
