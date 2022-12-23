package com.prac.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prac.util.JDBCUtil;

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
	
	public void join(UserVO vo) {
		String sql = "insert into members values(?, ?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getGender());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
	}
	
	
}
