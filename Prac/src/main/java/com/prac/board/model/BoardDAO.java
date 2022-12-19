package com.prac.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	
	private BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버클래스 에러");
		}
	}
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public String URL = "jdbc:oracle:thin:@172.30.1.71:1521:xe";
	public String UID = "prac";
	public String UPW = "prac";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

}
