package com.Foodiesgo.logic;

import com.Foodiesgo.DAO.SearchbyfoodnameDAO;
import com.Foodiesgo.model.Fooditems;

public class SearchByFoodName {
	public static void findByName(String name) throws Exception
	{
		Fooditems fooditem=SearchbyfoodnameDAO.findUsingName(name);
		System.out.println(fooditem.getFoodname()+"     "+fooditem.getPrice());
	}

}
