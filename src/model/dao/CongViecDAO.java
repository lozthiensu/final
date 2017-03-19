package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.CongViec;
import model.bean.Nganh;
import statics.InfoSQLServer;

public class CongViecDAO {

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

	public boolean them(CongViec congViec) {

		// MO ket noi
		connect();

		// Luu ket qua truy van

		// Luu thong tin account
		try {

			// Cau lenh insert
			String sql = "insert into CONGVIEC(SoCMND,NgayVaoCongTy,MaNganh,TenCongViec,TenCongTy,DiaChiCongTy,ThoiGianLamViec)"
					+ " VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Truyen 7 them so tren cau insert vao
			pr.setString(1, congViec.getSoCMND());
			pr.setString(2, congViec.getNgayVaoCongTy());
			pr.setInt(3, congViec.getMaNganh());
			pr.setString(4, congViec.getTenCongViec());
			pr.setString(5, congViec.getTenCongTy());
			pr.setString(6, congViec.getDiaChiCongTy());
			pr.setString(7, congViec.getThoiGianLamViec());

			// Thuc hien query, neu thanh cong tra ve true, nguoc lai tra ve false
			if(pr.executeUpdate() >= 0){
				return true;
			}
			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}
