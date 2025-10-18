package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); // 바꿀문자열.replace("A", "B") = 바꿀문자열의 A문자열을 모두 B로 바꿈
		
		System.out.println(oldStr);
		System.out.println(newStr);
		// oldStr이 newStr로 대체되는 것이 아니라 replace를 한 문자열을 새로 만드는 것
		// replace 이전의 문자열은 계속 존재
	}
}
