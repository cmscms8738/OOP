package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행"; // hobby가 "여행"이라는 객체를 참조
		hobby = null; //hobby의 참조를 null로 바꿔 "여행"객체는 쓰레기가 됨
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; // kind1의 "자동차"객체 참조를 null로 바꿔도  kind2가 참조하고 있어 쓰레기가 되지 않음
		System.out.println("kind2: " + kind2);
	}

}
