package com.toast.grid;

import java.util.HashMap;
import java.util.Map;

import com.toast.grid.vo.EmployeeVO;

public class MapTest {
	
	@org.junit.Test
	public void Test() {
		
		
		
		EmployeeVO  vo =  EmployeeVO.builder().empAge(30).empName("길동").empNo(-3).empSex("M").build();
		
		Map map = new HashMap<String, Object>();
		map.put("12", vo);
		EmployeeVO vo2 =  (EmployeeVO) map.get("12");
		
		
		
		
	}
}
