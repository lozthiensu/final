package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.SinhVien;

public class LietKeSinhVienForm extends ActionForm {
	ArrayList<SinhVien> sinhViens;
	String tuKhoa;

	public LietKeSinhVienForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<SinhVien> getSinhViens() {
		return sinhViens;
	}

	public void setSinhViens(ArrayList<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

}
