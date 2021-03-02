package com.toast.grid.dao;

import java.util.List;

import com.toast.grid.vo.EmployeeVO;

public interface EmployeeDAO {
	public int doJoin(EmployeeVO employeeVO);  
	
	public List getEmpList();
}
