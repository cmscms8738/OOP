package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// 0111110 - 126
		// 0111111 - 127
		// 1000000 - -128
		// 1000001 - -127
		// 1000010 - -126
		
		byte var1 = 125;
		for (int i = 0; i < 5; i++)
		{
			var1++;
			System.out.println("var1: " + var1);
		}
		
		System.out.println("------------------------");

		byte var2 = -125;
		for (int i = 0; i < 5; i++)
		{
			var2--;
			System.out.println("var2: " + var2);
		}
		
		// 1000010 - -126
		// 시험은 아래 4문항
		// 1000001 - -127
		// 1000000 - -128
		// 0111111 - 127
		// 0111110 - 126
	}

}
