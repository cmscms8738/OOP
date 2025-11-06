package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 Car의 객체 myCar 생성
		Car myCar = new Car();
		
		// 클래스 Car의 객체 myCar에 들어갈 데이터 초기화
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxspeed);
		System.out.println("현재속도: " + myCar.speed); // 아직 초기화안됨 - int의 초기값: 0
		
		// 객체 외부에서 참조할 때는 . 붙이기
		myCar.speed = 60;
		System.out.println("현재속도: " + myCar.speed);
	}

}
