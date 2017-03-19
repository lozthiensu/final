package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.SinhVien;
import model.bean.SinhVienNangCao;

public class LietKeSinhVienNangCaoForm extends ActionForm {
	
	
	//Form nay chua danh sach sinh vien nang cao
	
	ArrayList<SinhVienNangCao> sinhVienNangCaos;
	String tuKhoa;

	public LietKeSinhVienNangCaoForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<SinhVienNangCao> getSinhVienNangCaos() {
		return sinhVienNangCaos;
	}

	public void setSinhVienNangCaos(ArrayList<SinhVienNangCao> sinhVienNangCaos) {
		this.sinhVienNangCaos = sinhVienNangCaos;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

}
