package web_erp.service;

import java.sql.Connection;
import java.util.List;

import web_erp.dao.impl.TitleDaoimpl;
import web_erp.ds.JndiDs;
import web_erp.dto.Title;

public class TitleService {
	private Connection con = JndiDs.getConnection();
	private TitleDaoimpl dao = TitleDaoimpl.getInstance();
	
	public TitleService() {
		dao.setCon(con);
	}
	
	public List<Title> showTitles(){
		return dao.selectTitleByAll();
	}
	
	public void addTitle(Title title) {
		dao.insertTitle(title);
	}
	
	public void modiTitle(Title title) {
		dao.updateTitle(title);
	}
	
	public Title showTitle(Title title) {
		return dao.selectTitleByNo(title);
	}
	
	public void delTitle(int titleNo) {
		dao.deleteTitle(titleNo);
	}

}
