package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[] {1,2,3};
		intArray[0] = 10;
		System.out.println(intArray[0]);
		
		String str = null;
		str = "Java";
		System.out.println("총 문자수: " + str.length());
	}

}
