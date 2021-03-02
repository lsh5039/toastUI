package test;

public class Test {
	static int a = 0;
	
	 public static int func1() {
		
		return a+=1; 
	}
	
	public static void main(String[] args) {
	
		System.out.println(func1());
		
	}
	
}
