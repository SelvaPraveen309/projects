package com.Foodiesgo;

public class Sqlquery {

	public static void Datain(Registration obj) throws Exception {
		String query = "INSERT INTO Hotel_app(name,email,password,number)VALUES" + "('" + obj.name + "','" + obj.email
				+ "','" + obj.password + "','" + obj.number + "')";
		Connectjdbc.con(query);
	}

}
