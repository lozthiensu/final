package model.bean;

public class Truong {
	int maTruong;
	String tenTruong;
	String diaChi;
	String soDT;

	public Truong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truong(int maTruong, String tenTruong, String diaChi, String soDT) {
		super();
		this.maTruong = maTruong;
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}

	public int getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(int maTruong) {
		this.maTruong = maTruong;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
}
