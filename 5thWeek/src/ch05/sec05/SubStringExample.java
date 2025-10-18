package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		// 변수명.substring(m, n)
		// 변수명의 m부터 n-1까지의 문자열을 추출
		// n이 비어있으면 m부터 문자열 끝까지 추출
	}

}
