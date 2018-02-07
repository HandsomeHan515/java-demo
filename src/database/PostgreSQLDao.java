package database;

import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  

import database.DBUtil;

public class PostgreSQLDao {
	public static void main(String[] args) {
		Connection con = null;
		
		try {
			con = DBUtil.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement("select * from articles_tag");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("name" + rs.getString("name"));
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
