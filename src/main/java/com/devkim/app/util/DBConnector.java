package com.devkim.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLXML;

public class DBConnector {
	 public void getConnector() {
		 String user = "devkgm";
		 String password = "7560";
		 String url = "jdbc:oracle:thin:@gyeongmo806.site:1521:xe";
		 String driver="oracle.jdbc.driver.OracleDriver";
		 
		 try {
			 Class.forName(driver);	 
			 Connection connection = DriverManager.getConnection(url, user, password);
			 System.out.println(connection);
			 String sql = "SELECT * FROM REGIONS";
			 PreparedStatement st = connection.prepareStatement(sql);
			 ResultSet resultSet = st.executeQuery();
			 while(resultSet.next()) {
				 int n = resultSet.getInt(1);
				 String name = resultSet.getString(2);
				 System.out.println(n+" : "+name);
				 System.out.println("============");
			 }
			 
			 
		 } catch(Exception e) {
			 e.printStackTrace();
		 }

	 }
}
