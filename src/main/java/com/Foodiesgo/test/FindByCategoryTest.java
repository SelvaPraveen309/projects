package com.Foodiesgo.test;

import java.util.Scanner;

import com.Foodiesgo.logic.FindByCategory;

public class  FindByCategoryTest{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter category to sort");
		Scanner sc=new Scanner(System.in);
		String category=sc.next();
		FindByCategory.findUsingCategory(category);
		
	}

}
