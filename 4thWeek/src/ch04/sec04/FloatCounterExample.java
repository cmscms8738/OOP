package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f)//반복문에서 소수를 사용하지 않는 이유
		{
			System.out.println(x);
		}
	}

}
