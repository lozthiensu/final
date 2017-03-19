package model.bean;

public class SinhVienNangCao {
	// Day la mot doi tuong voi cac thuoc tinh dung cho viec thong ke theo yeu
	// cau cua de

	String soCMND;
	String hoTen;
	int maNganh;
	int maTruong;
	int maNganhCongTy;
	String tenCongTy;
	String thoiGianLamViec;

	public SinhVienNangCao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienNangCao(String soCMND, String hoTen, int maNganh, int maTruong, int maNganhCongTy, String tenCongTy,
			String thoiGianLamViec) {
		super();
		this.soCMND = soCMND;
		this.hoTen = hoTen;
		this.maNganh = maNganh;
		this.maTruong = maTruong;
		this.maNganhCongTy = maNganhCongTy;
		this.tenCongTy = tenCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
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

	public int getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
	}

	public int getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(int maTruong) {
		this.maTruong = maTruong;
	}

	public int getMaNganhCongTy() {
		return maNganhCongTy;
	}

	public void setMaNganhCongTy(int maNganhCongTy) {
		this.maNganhCongTy = maNganhCongTy;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}

}
