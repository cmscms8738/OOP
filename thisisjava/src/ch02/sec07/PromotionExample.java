package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환 실습(작은 타입 to 큰 타입)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		// 정수 to 실수
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F; //실수의 기본 타입은 double(8byte)
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}
