package model.bo;

import java.util.ArrayList;

import model.bean.Nganh;
import model.dao.NganhDAO;

public class NganhBO {

	NganhDAO nganhDAO = new NganhDAO();
	
	public ArrayList<Nganh> lietKe(){
		return nganhDAO.lietKe();
	}
}
