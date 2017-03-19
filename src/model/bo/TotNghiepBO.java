package model.bo;

import model.bean.TotNghiep;
import model.dao.TotNghiepDAO;

public class TotNghiepBO {
	TotNghiepDAO totNghiepDAO = new TotNghiepDAO();

	public boolean them(TotNghiep totNghiep) {
		return totNghiepDAO.them(totNghiep);
	}

}
