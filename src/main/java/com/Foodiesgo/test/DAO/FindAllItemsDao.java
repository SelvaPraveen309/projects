package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Foodiesgo.model.Fooditems;

public class FindAllItemsDao {
	public static List<Fooditems> findAllItems() throws Exception
	{
		List<Fooditems> items=new ArrayList<Fooditems>();
		Fooditems fooditem=null;
		Connection connection=Connectionutil.databaseConnection();	
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,food_name,price from menu_list";
		statement=connection.prepareStatement(query);
		result=statement.executeQuery();
		String foodName=null;
		int price=0;
		int id=0;
		while(result.next())
		{
			fooditem=new Fooditems();
			id=result.getInt("id");
			foodName=result.getString("food_name");
			price=result.getInt("price");
			fooditem.setId(id);
			fooditem.setFoodname(foodName);
			fooditem.setPrice(price);
			items.add(fooditem);
			
		}
		return items;
	}

}
