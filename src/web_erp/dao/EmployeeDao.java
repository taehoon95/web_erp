package web_erp.dao;

import java.util.List;

import web_erp.dto.Department;
import web_erp.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectEmpByAll();
	List<Employee> selectEmpByAllJoin();
	
	List<Employee> selectEmpByDeptNo(Department dept);
	Employee selectEmpByNo(Employee employee);
	int insertEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int deleteEmployee(int empNo);
}
