package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Truong;
import statics.InfoSQLServer;

public class TruongDAO {

	String url = InfoSQLServer.url;
	String userName = InfoSQLServer.userName;
	String password = InfoSQLServer.password;
	Connection connection;

	void connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("JDBC loi");
		}
	}

	public ArrayList<Truong> lietKe() {

		// MO ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu thong tin account
		ArrayList<Truong> truongs = new ArrayList<Truong>();
		try {

			// Cau lenh truy van
			String sql = "select * from Truong";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist truongs
			while (rs.next()) {
				truongs.add(new Truong(rs.getInt("MaTruong"), rs.getString("TenTruong"), rs.getString("DiaChi"),
						rs.getString("SoDT")));
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return truongs;
	}
}
