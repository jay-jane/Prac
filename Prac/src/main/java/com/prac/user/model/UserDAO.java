package com.prac.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private static UserDAO instance = new UserDAO();
	
	private UserDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버클래스 로드 에러");
		}
	}
	
	public static UserDAO getInstance() {
		return instance;
	}
	
	public String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public String UID = "prac";
	public String UPW = "prac";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
}
