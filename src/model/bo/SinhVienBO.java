package model.bo;

import java.util.ArrayList;

import model.bean.SinhVien;
import model.bean.SinhVienNangCao;
import model.dao.SinhVienDAO;

public class SinhVienBO {
	SinhVienDAO sinhVienDAO = new SinhVienDAO();

	public boolean them(SinhVien sinhVien) {
		return sinhVienDAO.them(sinhVien);
	}

	public ArrayList<SinhVien> lietKe() {
		return sinhVienDAO.lietKe();
	}

	public ArrayList<SinhVien> lietKe(String tuKhoa) {
		return sinhVienDAO.lietKe(tuKhoa);
	}

	public ArrayList<SinhVienNangCao> lietKeNangCao() {
		return sinhVienDAO.lietKeNangCao();
	}

	public ArrayList<SinhVienNangCao> lietKeNangCao(String tuKhoa) {
		return sinhVienDAO.lietKeNangCao(tuKhoa);
	}
}
