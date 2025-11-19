package ch06.sec13.exam02.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자의 public - 다른 모든 패키지에서 생성자를 호출(=객체를 생성)할 수 있음
	public A(boolean b) {
		
	}
	
	// 생성자의 default - 같은 패키지에서만 생성자를 호출(=객체를 생성)할 수 있음
	A(int b){ 
		
	}
	
	// 생성자의 private - 이 생성자가 있는 클래스 내부에서만 생성자를 호출(=객체를 생성)할 수 있음
	private A(String s) {
		
	}
}
