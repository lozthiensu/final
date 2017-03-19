package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Nganh;
import model.bean.Truong;
import statics.InfoSQLServer;

public class NganhDAO {


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

	public ArrayList<Nganh> lietKe() {

		// MO ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu thong tin account
		ArrayList<Nganh> nganhs = new ArrayList<Nganh>();
		try {

			// Cau lenh truy van
			String sql = "select * from Nganh";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist truongs
			while (rs.next()) {
				nganhs.add(new Nganh(rs.getInt("MaNganh"), rs.getString("TenNganh"), rs.getString("LoaiNganh")));
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nganhs;
	}
}
