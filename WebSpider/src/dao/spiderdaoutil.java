package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class spiderdaoutil {
public static Connection getconn() {
	
	//���ݿ���û���������ͷ���·��
	String username="root";
	String password="895663331";
	String url="jdbc:mysql://localhost:3306/test?characterEncoding=utf8";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		//ͨ�����ݿ���û���������ͷ���·��������ݿ�����
		Connection conn=DriverManager.getConnection(url, username, password);
		
		return conn;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		LogManager.getLogger().error(e.getMessage());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		LogManager.getLogger().error(e.getMessage());
	}
	
	return null;
}

public static void close(Connection conn,Statement stm,ResultSet rs) {
	if(rs!=null)
	{
		try {
			rs.close();
		} catch (SQLException e) {
			
			LogManager.getLogger().error(e.getMessage());
		}
	}
	if(stm!=null) {
		try {
			stm.close();
		} catch (SQLException e) {
			LogManager.getLogger().error(e.getMessage());
		}
	}
	if(conn!=null)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			LogManager.getLogger().error(e.getMessage());
		}
	}
	
}
public static void close(Connection conn,PreparedStatement pstm,ResultSet rs) {
	if(rs!=null)
	{
		try {
			rs.close();
		} catch (SQLException e) {
			
			LogManager.getLogger().error(e.getMessage());
		}
	}
	if(pstm!=null) {
		try {
			pstm.close();
		} catch (SQLException e) {
			LogManager.getLogger().error(e.getMessage());
		}
	}
	if(conn!=null)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			LogManager.getLogger().error(e.getMessage());
		}
	}
	
}


}