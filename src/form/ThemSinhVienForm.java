package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.Nganh;
import model.bean.Truong;

public class ThemSinhVienForm extends ActionForm {

	//Form nay no phai chua danh sach cac truong, danh sach cac nganh, hanhDong, va cac thuoc tinh cua 2 table SINHVIEN va TOTNGHIEP
	
	String hanhDong;
	ArrayList<Truong> truongs;
	ArrayList<Nganh> nganhs;

	String soCMND;
	String hoTen;
	String email;
	String soDT;
	String diaChi;
	int maTruong;
	int maNganh;
	String heTN;
	String ngayTN;
	String loaiTN;
	String ngayVaoCongTy;
	String tenCongViec;
	String tenCongTy;
	String diaChiCongTy;
	String thoiGianLamViec;

	public ArrayList<Truong> getTruongs() {
		return truongs;
	}

	public void setTruongs(ArrayList<Truong> truongs) {
		this.truongs = truongs;
	}

	public ArrayList<Nganh> getNganhs() {
		return nganhs;
	}

	public void setNganhs(ArrayList<Nganh> nganhs) {
		this.nganhs = nganhs;
	}

	public ThemSinhVienForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHanhDong() {
		return hanhDong;
	}

	public void setHanhDong(String hanhDong) {
		this.hanhDong = hanhDong;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(int maTruong) {
		this.maTruong = maTruong;
	}

	public int getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
	}

	public String getHeTN() {
		return heTN;
	}

	public void setHeTN(String heTN) {
		this.heTN = heTN;
	}

	public String getNgayTN() {
		return ngayTN;
	}

	public void setNgayTN(String ngayTN) {
		this.ngayTN = ngayTN;
	}

	public String getLoaiTN() {
		return loaiTN;
	}

	public void setLoaiTN(String loaiTN) {
		this.loaiTN = loaiTN;
	}

	public String getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}

	public void setNgayVaoCongTy(String ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getDiaChiCongTy() {
		return diaChiCongTy;
	}

	public void setDiaChiCongTy(String diaChiCongTy) {
		this.diaChiCongTy = diaChiCongTy;
	}

	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}

}
