package com.Foodiesgo.test;

import java.time.LocalTime;
import java.util.Scanner;

import com.Foodiesgo.model.Fooditems;

public class Fooditemstest {
	public static void fooditems() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter food name ");
		String foodname= scan.next();
	   System.out.println("Enter the pirce ");
		int price = scan.nextInt();
		System.out.println("Enter food name ");
		String available= scan.next();
		System.out.println("Enter food name ");
		String foodstyle= scan.next();
		System.out.println("Enter start time in hours ");
		int startHour=scan.nextInt();
		System.out.println("Enter start time in minutes ");
		int startMinutes=scan.nextInt();
		System.out.println("Enter end time in hours ");
		int endHour=scan.nextInt();
		System.out.println("Enter start time in minutes ");
		int endMinutes=scan.nextInt();
		LocalTime start=LocalTime.of(startHour, startMinutes);
		LocalTime end=LocalTime.of(endHour, endMinutes);
		
		Fooditems items = new Fooditems();
		items.setFoodname(foodname);
		items.setPrice(price);
		items.setAvailable(available);
		items.setFoodstyle(foodstyle);
		items.setStartingtime(start);
		items.setEndingtime(end);
		
		
		
	}
}
