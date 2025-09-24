package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); //AND
		System.out.println("45 | 25 = " + (45 | 25)); //OR
		System.out.println("45 ^ 25 = " + (45 ^ 25)); //XOR
		System.out.println("~45 = " + (~45)); //보수
		System.out.println("------------------------------");
		
		byte receiveData = -120;
		
		int unsignedInt1 = receiveData & 255; //구조적 언어 style - 비트 논리곱
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData); //객체적 언어 style - 자바 API
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
