package com.devkim.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBConnector {
	 public static Connection getConnector() throws Exception {
		 String user = "devkgm";
		 String password = "7560";
		 String url = "jdbc:oracle:thin:@gyeongmo806.site:1521:xe";
		 String driver="oracle.jdbc.driver.OracleDriver";
		 
	
		 Class.forName(driver);	 
		 Connection connection = DriverManager.getConnection(url, user, password);

		 return connection;
	

	 }
	 public static void disConnect(ResultSet rs, PreparedStatement ps, Connection con) throws Exception{
		 rs.close();
		 ps.close();
		 con.close();
	 }
	 public static void disConnect(PreparedStatement ps, Connection con) throws Exception{

		 ps.close();
		 con.close();
	 }
}
