package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import form.ThemSinhVienForm;
import model.bean.CongViec;
import model.bean.Nganh;
import model.bean.SinhVien;
import model.bean.TotNghiep;
import model.bean.Truong;
import model.bo.NganhBO;
import model.bo.SinhVienBO;
import model.bo.TotNghiepBO;
import model.bo.TruongBO;
import statics.Check;

public class ThemSinhVienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// Khai bao form them sinh vien
		// De yeu cau them du lieu vao 2 bang trong sql nen form nay chua tat ca
		// cac thuoc tinh cua 2 bang luon
		ThemSinhVienForm themSinhVienForm = (ThemSinhVienForm) form;

		// Khai bao cac loai BO
		SinhVienBO sinhVienBO = new SinhVienBO();
		TotNghiepBO totNghiepBO = new TotNghiepBO();
		TruongBO truongBO = new TruongBO();
		NganhBO nganhBO = new NganhBO();

		// Khai bao va lay du lieu cho arraylist chua danh sach truong va nganh
		// dung cho selectbox
		ArrayList<Truong> truongs = truongBO.lietKe();
		ArrayList<Nganh> nganhs = nganhBO.lietKe();

		// Dua danh sach truong va danh sach nganh len form
		themSinhVienForm.setTruongs(truongs);
		themSinhVienForm.setNganhs(nganhs);

		// Lay gia tri cua bien hanhDong
		// Neu hanh dong = "submit" thi thuc hien cac thao tac them vao csdl,
		// truoc khi them can check
		// Nguoc lai thi forward den trang them
		String hanhDong = themSinhVienForm.getHanhDong();

		// Neu hanhDong = "submit", tuc la nguoi dung click vao nut submit, thuc
		// hien hiem tra du lieu va them voa csdl
		if ("submit".equals(hanhDong)) {

			// Khai bao bien de chua cac loi
			ActionErrors errors = new ActionErrors();

			// Lay so cmnd de kiem tra
			String soCMND = themSinhVienForm.getSoCMND();

			// Lay ngayTN de kiem tra
			String ngayTNForm = themSinhVienForm.getNgayTN();

			// THiet lap dinh dang ngay thang nam la yyyy-MM-dd
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			// Bien de luu so ngay chenh lech giua ngay hien tai va ngay tot
			// nghiep
			long soNgayChenhLech = 0;

			// Neu so ngay tot nghiep cach so ngay hien tai < 365, tuc la chua
			// tot nghiep dc 1 nam
			// thi phai bao loi, nguoc lai ok.

			// Chuyen ngay thang tu input la dang String qua kieu
			// Date(java.ulti)
			try {
				// Chuyen ngay thang tu input ngayTN
				Date ngayTN = dateFormat.parse(ngayTNForm);

				// Lay ngay hien tai
				Date homNay = new Date();

				// Tinh toan so ngay chenh lech
				soNgayChenhLech = Check.getDifferenceDays(ngayTN, homNay);
			} catch (Exception e) {
			}

			// Neu soCMND = "" tuc la soCMND = rong thi bao loi
			if ("".equals(soCMND)) {

				// Them bien loiSoCMND vao form, bien loiSoCMND se co tren
				// themsv.jsp tai dong html:errors
				// Gia tri text thong bao ra la error.socmnd, nam trong file
				// statics/ThongBao.properities
				errors.add("loiSoCMND", new ActionMessage("error.socmnd"));

				// Luu loi lai
				saveErrors(request, errors);

				// Forward ve trang them sinh vien de hien loi len
				return mapping.findForward("them");
			} else if (soNgayChenhLech < 365) {
				// Cac buoc tuong tu nhu trne kia

				errors.add("loiNgayTN", new ActionMessage("error.ngaytn"));

				saveErrors(request, errors);

				return mapping.findForward("them");
			}

			// Neu co loi thi cac dong forward trne kia no se thoat khoi action,
			// neu khong co loi no se thuc hien cac lenh duoi day

			// Tao ra doi tuong sinhVien tu cac gia tri nhan duoc tu form
			SinhVien sinhVien = new SinhVien();
			sinhVien.setSoCMND(themSinhVienForm.getSoCMND());
			sinhVien.setHoTen(themSinhVienForm.getHoTen());
			sinhVien.setEmail(themSinhVienForm.getEmail());
			sinhVien.setDiaChi(themSinhVienForm.getDiaChi());
			sinhVien.setSoDT(themSinhVienForm.getSoDT());

			// Tao ra doi tuong totNghiep tu cac gia tri nhan duoc tu form
			TotNghiep totNghiep = new TotNghiep();
			totNghiep.setSoCMND(themSinhVienForm.getSoCMND());
			totNghiep.setMaTruong(themSinhVienForm.getMaTruong());
			totNghiep.setMaNganh(themSinhVienForm.getMaNganh());
			totNghiep.setHeTN(themSinhVienForm.getHeTN());
			totNghiep.setNgayTN(themSinhVienForm.getNgayTN());
			totNghiep.setLoaiTN(themSinhVienForm.getLoaiTN());

			// Thuc hien insert vao csdl hai doi tuong sinhVien va totNghiep,
			// Neu ca 2 tra ve true nghia la insert thanh cong, forward ve
			// daThem
			// Nguoc lai forward ve them
			if (sinhVienBO.them(sinhVien) == true && totNghiepBO.them(totNghiep) == true) {
				return mapping.findForward("daThem");
			} else {
				return mapping.findForward("them");
			}

		} else {
			// Neu gia tri bien hanhDong khong phai = "submit" thi forward ve
			// them
			return mapping.findForward("them");
		}

	}
}
