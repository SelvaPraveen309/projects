package com.Foodiesgo.test;

import java.util.Scanner;

import com.Foodiesgo.logic.SearchByFoodName;

public class Searchbynametest {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to find");
		String name=sc.nextLine();
		SearchByFoodName.findByName(name);
		
		
	}

}
