package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionutil {
public static Connection databaseConnection() throws Exception {
	Connection connection = DriverManager
				.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println("connection geted ="+connection);
		return connection;
}
}
