package com.Foodiesgo.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Foodiesgo.DAO.FindAllItemsDao;
import com.Foodiesgo.DAO.FoodPriceFinder;
import com.Foodiesgo.DAO.TransactionInsertion;
import com.Foodiesgo.model.Fooditems;

public class FoodOrdering {
	static List<Integer> foodItems=null;
	static Scanner sc=new Scanner(System.in);
	public static void allFoods() throws Exception
	{
		List<Fooditems> foods=FindAllItemsDao.findAllItems();
		for(Fooditems food:foods)
		{
			System.out.println(food.getId()+"   "+food.getFoodname()+"    "+food.getPrice());
		}
		foodItems=new ArrayList<Integer>();
		orderFood();
		
	}
	public static void orderFood() throws Exception
	{
		int total=0;
		System.out.println("select the food you wanted");
		System.out.println("enter 0 to exit and continue to payment");
		while(sc.hasNext())
		{
			int id=sc.nextInt();
			if(id==0)
			{
				break;
			}
			else
			{
				foodItems.add(id);
			}
		}
			for(Integer foodId:foodItems)
			{
				int price=FoodPriceFinder.priceFinder(foodId);
				total=total+price;
				
			}
			System.out.println("Your total price is : "+total);
			System.out.println("1)continue to payment");
			System.out.println("2)continue shopping");
			int option=sc.nextInt();
			if(option==1)
			{
				int verified=payment(total);
				if(verified==1)
				{
					for(Integer orderId:foodItems)
					{
						TransactionInsertion.transaction(orderId);
					}
				}
			}
			else if(option==2)
			{
				orderFood();
			}
		}
		
	
	public static int payment(int total)
	{
		System.out.println("Enter upi id");
		String upi=sc.next();
		System.out.println("Enter amount to pay");
		System.out.println("Please pay : "+total);
		int amount=sc.nextInt();
		if(amount>total || amount<total)
		{
			System.out.println("Please only pay : "+total);
			payment(total);
		}
		else if(amount==total)
		{
			return 1;
		}
		return 1;
		
	}

}
