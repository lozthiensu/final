package model.bo;

import java.util.ArrayList;

import model.bean.Truong;
import model.dao.TruongDAO;

public class TruongBO {
	TruongDAO truongDAO = new TruongDAO();
	
	public ArrayList<Truong> lietKe(){
		return truongDAO.lietKe();
	}

}
