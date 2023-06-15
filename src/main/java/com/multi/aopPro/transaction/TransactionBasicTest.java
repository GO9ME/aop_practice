package com.multi.aopPro.transaction;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionBasicTest {
	public static void main(String[] args) {
			String url = "jdbc:mysql://127.0.0.1:3306/erp?serverTimezone=UTC";
			String user = "erp";
			String password = "erp";
			String sql ="";
			Connection con =null;
			PreparedStatement ptmt =null;
		
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
				
				
			
				sql = "insert into test values('test21','1234','서울','장동건',10000)";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();
				
			
				sql =  "insert into test values('test22','1234','인천','이민호',10000)";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();
				
				sql =  "insert into test values('test23','1234','군산','장기용',10000)";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();
			
				
			}catch(ClassNotFoundException e){
				System.out.println("예외가 발생했습니다.");
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				
			}
		

	}

}
