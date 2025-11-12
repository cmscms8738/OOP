package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("포르쉐"); // instance 맴버는 new 하는 시기에 메모리에 올라감
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
