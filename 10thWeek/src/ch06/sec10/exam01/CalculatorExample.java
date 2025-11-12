package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

		// 정적 맴버는 클래스 로더에 의해 메소드 영역에 저장되어 객체 생성없이 사용가능
	}

}
