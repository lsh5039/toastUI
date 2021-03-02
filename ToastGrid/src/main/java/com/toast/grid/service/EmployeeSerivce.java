package com.toast.grid.service;

import java.util.List;

import com.toast.grid.vo.EmployeeVO;

public interface EmployeeSerivce {
	public int doJoin(EmployeeVO employeeVO);
	public List getEmpList();
}
