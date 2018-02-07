package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	private static final String URL = "jdbc:postgresql://handsomehan.cn:5432/puncheers";;
	private static final String USR = "handsomehan";
	private static final String PWD = "13110581095";
	
	static {
		try {
			// 加载驱动
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("驱动加载失败！");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URL, USR, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
