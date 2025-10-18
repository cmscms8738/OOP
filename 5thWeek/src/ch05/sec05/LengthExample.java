package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length(); // 변수명.length() = 변수의 자리수를 추출
		if(length == 13)
		{
			System.out.println("주민번호 자리수가 맞습니다.");
		}
		else
		{
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
