package test.di.vo;

import lombok.Builder;

public class BreadVo2 {
	private String name;
	private int age;
	
	
	@Builder
	public BreadVo2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	
}
