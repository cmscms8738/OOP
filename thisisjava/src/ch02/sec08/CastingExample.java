package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 큰 범위 타입 to 작은 범위 타입 - compiler 에러는 없어도 logical 에러가 일어날 수 있음
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2); // 수가 작아서 4바이트 int가 1바이트 byte로 바뀌어도 값은 유지
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4); // 수가 작아서 8바이트 long이 4바이트 int로 바뀌어도 값은 유지
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); // int 65가 유니코드 65에 해당하는 A출력
		
		double var7 = 3.14; 
		int var8 = (int) var7;
		System.out.println(var8); // 실수 3.14가 정수로 바뀌면서 소수점 아래가 삭제

		
	}

}
