package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LietKeSinhVienForm;
import form.LietKeSinhVienNangCaoForm;
import model.bean.SinhVien;
import model.bean.SinhVienNangCao;
import model.bo.SinhVienBO;

public class LietKeSinhVienNangCaoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		//Khai bao form liet ke sinh vien
		LietKeSinhVienNangCaoForm lietKeSinhVienNangCaoForm = (LietKeSinhVienNangCaoForm) form;

		//Khai bao BO sinh vien
		SinhVienBO sinhVienBO = new SinhVienBO();

		//Khai bao bien tuKhoa tu form		
		String tuKhoa = lietKeSinhVienNangCaoForm.getTuKhoa();
	
		//Khai bao arraylist chua danh sach sinh vien tam thoi
		ArrayList<SinhVienNangCao> sinhVienNangCaos;

		// "" la chuoi rong
		// Neu tu khoa = chuoi rong, thi lay tat ca sinh vien, nguoc lai thi tim theo tuKhoa
		if(tuKhoa == null || tuKhoa.length() < 1){
			sinhVienNangCaos = sinhVienBO.lietKeNangCao();
		}else{
			sinhVienNangCaos = sinhVienBO.lietKeNangCao(tuKhoa);
		}

		//Dua danh sach sinh vien tam thoi len form de hien thi
		lietKeSinhVienNangCaoForm.setSinhVienNangCaos(sinhVienNangCaos);;

		//Forward ve dia chi trong struts_config.xml
		return mapping.findForward("lietKeNangCao");
	}
}
