package test.di.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class BreadVo1 {
	private String name;
	private int age;
	private int birth;
	
	/*
	 * public String getName() { return name; }
	 * 
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * public int getAge() { return age; }
	 * 
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */

	
}
