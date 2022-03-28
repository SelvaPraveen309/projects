package com.Foodiesgo;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FoodiesHome{
	//private static Logger log= LogManager.getLogger(SignUp.class);
	public static void main(String[] args)throws Exception {
		
		FoodiesHome.Home();
	}
	
	public static void Home() throws Exception {
	System.out.println("1)Register");
	System.out.println("2)Login");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	if(option==1)
	{
	SignUp.SignUpin();
	}
	else if(option==2) {
	Logindetails.login();	
	}
		
	

	}

}
