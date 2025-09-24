package test;

public class test {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y; //int 범위를 벗어나 overflow 발생
		
		System.out.println(z);

	}

}
