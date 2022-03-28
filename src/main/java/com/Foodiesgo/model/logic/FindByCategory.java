package com.Foodiesgo.logic;

import java.util.List;

import com.Foodiesgo.DAO.FindByCategoryDao;
import com.Foodiesgo.model.Fooditems;

public class FindByCategory {
	public static void findUsingCategory(String category) throws Exception
	{
		List<Fooditems> items=FindByCategoryDao.findByCategory(category);
		for(Fooditems item:items)
		{
			System.out.println(item.getFoodname()+"  "+item.getPrice());
		}
	}

}
