package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LietKeSinhVienForm;
import model.bean.SinhVien;
import model.bo.SinhVienBO;

public class LietKeSinhVienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//Khai bao form liet ke sinh vien
		LietKeSinhVienForm lietKeSinhVienForm = (LietKeSinhVienForm) form;

		//Khai bao BO sinh vien
		SinhVienBO sinhVienBO = new SinhVienBO();
		
		//Khai bao bien tuKhoa tu form
		String tuKhoa = lietKeSinhVienForm.getTuKhoa();
		
		//Khai bao arraylist chua danh sach sinh vien tam thoi
		ArrayList<SinhVien> sinhViens;
		
		// "" la chuoi rong
		// Neu tu khoa = chuoi rong, thi lay tat ca sinh vien, nguoc lai thi tim theo tuKhoa
		if(tuKhoa == null || tuKhoa.length() < 1){
			sinhViens = sinhVienBO.lietKe();
		}else{
			sinhViens = sinhVienBO.lietKe(tuKhoa);
		}
		
		//Dua danh sach sinh vien tam thoi len form de hien thi
		lietKeSinhVienForm.setSinhViens(sinhViens);

		//Forward ve dia chi trong struts_config.xml
		return mapping.findForward("lietKe");
	}
}
