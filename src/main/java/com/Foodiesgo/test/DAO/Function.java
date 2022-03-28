package com.Foodiesgo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Function {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String menuname= "idly";
		// get connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	 String	query ="select get_price (?)as price"; 
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,menuname);
        ResultSet rs = statement.executeQuery();
        if(rs.next()) {
        	int price = rs.getInt("price");
			System.out.println(price);
        }
        
        
        
        
	}

}
