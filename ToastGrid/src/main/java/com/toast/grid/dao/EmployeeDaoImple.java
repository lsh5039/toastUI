package com.toast.grid.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toast.grid.vo.EmployeeVO;


@Repository
public class EmployeeDaoImple implements EmployeeDAO {
	private static final Logger logger= LoggerFactory.getLogger(EmployeeDaoImple.class);
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAME_SPACE = "com.toast.grid.dao.EmployeeDAO";
	
	
	public EmployeeDaoImple() {
		System.out.println("생성");
	}
	
	
	@Override
	public int doJoin(EmployeeVO employeeVO) {
		
		
		int result =sqlSession.insert(NAME_SPACE+".doJoin",employeeVO);
		
		logger.info("daoImple단::::::::::: 결과  : "+result);
		
		
		return result;
	}


	@Override
	public List getEmpList() {
		
		return sqlSession.selectList(NAME_SPACE+".getEmpList");
	}

}
