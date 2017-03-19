package model.bean;

public class TotNghiep {

	String soCMND;
	int maTruong;
	int maNganh;
	String heTN;
	String ngayTN;
	String loaiTN;

	public TotNghiep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TotNghiep(String soCMND, int maTruong, int maNganh, String heTN, String ngayTN, String loaiTN) {
		super();
		this.soCMND = soCMND;
		this.maTruong = maTruong;
		this.maNganh = maNganh;
		this.heTN = heTN;
		this.ngayTN = ngayTN;
		this.loaiTN = loaiTN;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
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
}
