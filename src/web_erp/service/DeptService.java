package web_erp.service;

import java.sql.Connection;
import java.util.List;


import web_erp.dao.impl.DepartmentDaoImpl;
import web_erp.ds.JndiDs;
import web_erp.dto.Department;

public class DeptService {
	
	private Connection con = JndiDs.getConnection();
	private DepartmentDaoImpl dao = DepartmentDaoImpl.getInstance();
	
	public DeptService() {
		dao.setCon(con);
	}
	
	public List<Department> showDepartments(){
		return dao.selectDeptByAll();
	}
	
	public Department showDepartment(Department dept) {
		return dao.selectDeptByNo(dept);
	}
	
	public void addDept(Department dept) {
		dao.insertDepartment(dept);
	}
	
	public void modiDept(Department dept) {
		dao.updateDepartment(dept);
	}
	
	public void delDept(int deptNo) {
		dao.deleteDepartment(deptNo);
	}
}
