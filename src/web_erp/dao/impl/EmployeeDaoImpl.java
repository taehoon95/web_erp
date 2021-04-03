package web_erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web_erp.dao.EmployeeDao;
import web_erp.dto.Department;
import web_erp.dto.Employee;
import web_erp.dto.Title;

public class EmployeeDaoImpl implements EmployeeDao {

	private static EmployeeDaoImpl instance = new EmployeeDaoImpl();

	public static EmployeeDaoImpl getInstance() {
		if (instance == null) {
			instance = new EmployeeDaoImpl();
		}
		return instance;
	}

	private EmployeeDaoImpl() {
	}

	private Connection con;

	public void setCon(Connection con) {
		this.con = con;
	}

	private Employee getEmployee(ResultSet rs) throws SQLException {
		int empNo = 0;
		String empName = null;
		Title title = null;
		Employee manager = null;
		int salary = 0;
		Department dept = null;

		try {
			empNo = rs.getInt("empno");
		} catch (SQLException e) {}
		try {
			empName = rs.getString("empname");
		} catch (SQLException e) {}
		try {
			title = new Title(rs.getInt("title_no"));
		} catch (SQLException e) {}
		try {
			manager = new Employee(rs.getInt("manager_no"));
		} catch (SQLException e) {}
		try {
			salary = rs.getInt("salary");
		} catch (SQLException e) {}
		try {
			dept = new Department(rs.getInt("deptNo"));
		} catch (SQLException e) {}
		try {
			title.setName(rs.getString("tname"));
		} catch (SQLException e) {}

		try {
			manager.setEmpName(rs.getString("mgrName"));
		} catch (SQLException e) {}

		try {
			dept.setName(rs.getString("deptname"));
		} catch (SQLException e) {}

		try {
			dept.setFloor(rs.getInt("floor"));
		} catch (SQLException e) {}

		return new Employee(empNo, empName, title, manager, salary, dept);
	}

	@Override
	public List<Employee> selectEmpByAllJoin() {
		String sql = "select empno,empname,title_no,title_name,manager_no"
				+ ",manager_name,salary,deptNo,deptname,floor" + " from vw_full_employee";
		try (PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Employee> list = new ArrayList<>();
				do {
					list.add(getEmployee(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> selectEmpByAll() {
		String sql = "select empno,empname,title as title_no,manager as manager_no ,salary,dept as deptNo from employee;";
		try (PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Employee> list = new ArrayList<>();
				do {
					list.add(getEmployee(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee selectEmpByNo(Employee emp) {
		String sql = "select empno,empname,title as title_no" + ",manager as manager_no,salary,dept as deptno"
				+ " from employee where empno = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, emp.getEmpNo());

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getEmployee(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertEmployee(Employee emp) {
		String sql = "insert into employee values (?,?,?,?,?,?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, emp.getEmpNo());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setInt(3, emp.getTitle().getNo());
			pstmt.setInt(4, emp.getManager().getEmpNo());
			pstmt.setInt(5, emp.getSalary());
			pstmt.setInt(6, emp.getDept().getNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateEmployee(Employee emp) {
		String sql = "update employee " + "set empname = ?,title = ?, manager = ?, salary =?, dept = ? "
				+ "where empno = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, emp.getEmpName());
			pstmt.setInt(2, emp.getTitle().getNo());
			pstmt.setInt(3, emp.getManager().getEmpNo());
			pstmt.setInt(4, emp.getSalary());
			pstmt.setInt(5, emp.getDept().getNo());
			pstmt.setInt(6, emp.getEmpNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmployee(int empNo) {
		String sql = "delete from employee where empno = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, empNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Employee> selectEmpByDeptNo(Department dept) {
		String sql = "select empno,empname,title as title_no ,manager as manager_no ,salary,dept as deptno from employee where dept = (select deptNo from department where deptNo = ?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, dept.getNo());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					ArrayList<Employee> list = new ArrayList<Employee>();
					do {
						list.add(getEmployee(rs));
					} while (rs.next());
					return list;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
