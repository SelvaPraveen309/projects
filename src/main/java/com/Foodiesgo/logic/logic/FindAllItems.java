package com.Foodiesgo.logic;

import java.util.List;

import com.Foodiesgo.DAO.FindAllItemsDao;
import com.Foodiesgo.model.Fooditems;

public class FindAllItems {
	public static void getAllItems() throws Exception
	{
		List<Fooditems> items=FindAllItemsDao.findAllItems();
		for(Fooditems item:items)
		{
			System.out.println(item.getId()+"   "+item.getFoodname()+"       "+item.getPrice());
		}
	}

}
