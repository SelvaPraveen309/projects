package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Foodiesgo.model.Fooditems;

public class FindByCategoryDao {
	public static List<Fooditems> findByCategory(String category) throws Exception
	{
		Connection connection=Connectionutil.databaseConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		Fooditems fooditem=null;
		List<Fooditems> item=new ArrayList<Fooditems>();
		String query="select food_name,price from menu_list where type_of_items=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, category);
		result=statement.executeQuery();
		String name=null;
		int price=0;
		while(result.next())
		{ 
			fooditem=new Fooditems();
			name=result.getString("food_name");
			price=result.getInt("price");
			fooditem.setFoodname(name);
			fooditem.setPrice(price);
			item.add(fooditem);
		}
		return item;
		
		
	}

}
