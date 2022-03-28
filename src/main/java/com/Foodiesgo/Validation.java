package com.Foodiesgo;

public class Validation {

	static int count = 0;

	public static int Checkname(String name) throws Exception {
		if (name.isEmpty() || name.isBlank()) {
			throw new Exception("Enter valid name");

		} else {
			return 1;
			// System.out.println("validation name completed");
		}
	}

	public static int Checkemail(String email) throws Exception {
		if (!email.contains("@") && !email.contains(".")) {
//				System.out.println(" valid email");
			throw new Exception(" valid mail");

		} else {

			return 1;
		}

	}

	public static int Checkpassword(String password) throws Exception {
		if (password.length() < 8 || password.isEmpty() || password.isBlank() || password.length() > 16) {
			throw new Exception("invalid or Wrong password ");

		} else {

			// System.out.println("Valaditaton password Completed");
			return 1;
		}
	}

	public static int Checknumber(String number) throws Exception {
		char count1 = 0;
		char[] Checknumber = number.toCharArray();
		if (number.length() < 10 || number.length() > 10) {
			throw new Exception("Enter only 10 Digits  ");

		} else {
			count1++;
		}
		for (char i : Checknumber) {
			if (Character.isAlphabetic(i)) {
				count1++;
				throw new Exception("only number");

			}
			if (count1 == 1) {
				break;

			}

		}
		return 1;

	}
}
