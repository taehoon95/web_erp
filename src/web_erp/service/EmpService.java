package web_erp.service;

import java.sql.Connection;
import java.util.List;

import web_erp.dao.impl.EmployeeDaoImpl;
import web_erp.ds.JndiDs;
import web_erp.dto.Employee;

public class EmpService {
	private Connection con = JndiDs.getConnection();
	private EmployeeDaoImpl dao = EmployeeDaoImpl.getInstance();
	
	public EmpService() {
		dao.setCon(con);
	}
	
	public List<Employee> showEmployees(){
		return dao.selectEmpByAll();
	}
	
	public void addEmp(Employee emp) {
		dao.insertEmployee(emp);
	}
	
	public void modiEmp(Employee emp) {
		dao.updateEmployee(emp);
	}
	
	public void delEmp(int empNo) {
		dao.deleteEmployee(empNo);
	}
	
	public Employee showEmployee(Employee emp) {
		return dao.selectEmpByNo(emp);
	}
}
