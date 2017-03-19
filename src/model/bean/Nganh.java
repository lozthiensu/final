package model.bean;

public class Nganh {
	int maNganh;
	String tenNganh;
	String loaiNganh;

	public Nganh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nganh(int maNganh, String tenNganh, String loaiNganh) {
		super();
		this.maNganh = maNganh;
		this.tenNganh = tenNganh;
		this.loaiNganh = loaiNganh;
	}

	public int getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getLoaiNganh() {
		return loaiNganh;
	}

	public void setLoaiNganh(String loaiNganh) {
		this.loaiNganh = loaiNganh;
	}

}
