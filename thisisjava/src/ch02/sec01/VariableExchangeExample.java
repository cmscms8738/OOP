package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 3;
		System.out.println("x:"+x+" y:"+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x+" y:"+y);
	}

}
