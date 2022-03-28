package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class TransactionInsertion {
	public static void transaction(int id) throws Exception {
		Date date = Date.valueOf(LocalDate.now());
		Connection connection = Connectionutil.databaseConnection();
		PreparedStatement statement = null;
		ResultSet result = null;
		String query = "insert into food_transactions(user_id,food_id,ordered_on)values(?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setInt(1, 1);
		statement.setInt(2, id);
		statement.setDate(3, date);
		int rows = statement.executeUpdate();
		System.out.println(rows);

	}

}
