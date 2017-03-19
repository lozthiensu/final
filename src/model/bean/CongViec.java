package model.bean;

public class CongViec {
	String soCMND;
	String ngayVaoCongTy;
	int maNganh;
	String tenCongViec;
	String tenCongTy;
	String diaChiCongTy;
	String thoiGianLamViec;

	public CongViec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongViec(String soCMND, String ngayVaoCongTy, int maNganh, String tenCongViec, String tenCongTy,
			String diaChiCongTy, String thoiGianLamViec) {
		super();
		this.soCMND = soCMND;
		this.ngayVaoCongTy = ngayVaoCongTy;
		this.maNganh = maNganh;
		this.tenCongViec = tenCongViec;
		this.tenCongTy = tenCongTy;
		this.diaChiCongTy = diaChiCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}

	public void setNgayVaoCongTy(String ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}

	public int getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
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
