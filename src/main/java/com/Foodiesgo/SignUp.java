package com.Foodiesgo;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SignUp {
//	private static Logger log= LogManager.getLogger(SignUp.class);
	public static void SignUpin() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE NAME ");
		String name = sc.nextLine();

		System.out.println("ENTER THE EMAIL ");
		String email = sc.nextLine();

		System.out.println("ENTER THE PASSWORD ");
		String password = sc.nextLine();

		System.out.println("ENTER THE NUMBER ");
		String number = sc.nextLine();
		int a = 0, b = 0, c = 0, d = 0;
		try {

			a = Validation.Checkname(name);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());

		}
		try {

			b = Validation.Checkemail(email);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());

		}
		try {

			c = Validation.Checkpassword(password);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());

		}
		try {

			d = Validation.Checknumber(number);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());

		}
		if (a + b + c + d == 4) {
			Registration t = new Registration(name, email, password, number);
			Sqlquery.Datain(t);

		}

	}
}
