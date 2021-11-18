package mycom.duck;

public class Test {
	
	static int mx = 100; //클래스변수
	
	private int x; //인스턴스 변수
	
	public Test() {
		x = 300; 
	}
	
	public void display() {
		int x = 400; //지역변수
		System.out.println(x);
	}

}
