package model.bean;

public class SinhVien {
	String soCMND;
	String hoTen;
	String email;
	String soDT;
	String diaChi;

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String soCMND, String hoTen, String email, String soDT, String diaChi) {
		super();
		this.soCMND = soCMND;
		this.hoTen = hoTen;
		this.email = email;
		this.soDT = soDT;
		this.diaChi = diaChi;
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

}
