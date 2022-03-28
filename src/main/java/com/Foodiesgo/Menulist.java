package com.Foodiesgo;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Menulist {
	private static Logger log= LogManager.getLogger(SignUp.class);
	public static void menulist() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Breakfast");
		System.out.println("2:Lunch");
		System.out.println("3:Dinner");
		System.out.println("4:Search by food name");
		System.out.println("5:sort by price");
		System.out.println("6.Back");
		int option = sc.nextInt();
		if (option == 1) {
			Breakfast.breakfast();
		} else if (option == 2) {
			Lunch.lunch();
		} else if (option == 3) {
			Dinner.dinner();
		} else if (option == 4) {
			System.out.println("enter food name");
			String name = sc.next();
			Searchbyfoodname.searchfood(name);
		} else if (option == 5) {
			Sortbyprice.sortprice();
		}
	
	}

}
