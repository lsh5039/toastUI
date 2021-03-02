package test.di.service;

import org.springframework.stereotype.Service;

import test.di.vo.BreadVo1;

@Service
public class HomeService {
	public void backHome() {
		BreadVo1 vo1 = BreadVo1.builder()
								.birth(20)
								.age(15)
								.name("나라")
								.build();
		
		BreadVo1 vo2 = new BreadVo1("나리",15,20);
		
		
		
		
		System.out.println(vo1.getName()+"퇴근하자");
		
		System.out.println("--------------------------");
		
		
		System.out.println();
	}
}
