package com.toast.grid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toast.grid.dao.EmployeeDAO;
import com.toast.grid.vo.EmployeeVO;

@Service
public class EmployeeServiceImple implements EmployeeSerivce{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	public EmployeeServiceImple() {
		System.out.println("서비스 생성");
	}
	
	
	@Override
	public int doJoin(EmployeeVO employeeVO) {
		
		System.out.println("serviceImple 단");
		System.out.println(employeeVO.getEmpName());
		return employeeDAO.doJoin(employeeVO);
	}


	@Override
	public List getEmpList() {
		
		return employeeDAO.getEmpList(); 
	}
	
}
