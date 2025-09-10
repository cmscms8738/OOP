package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 5;
		int minute = 30;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (60 * hour) + minute;
		System.out.println("총" + totalMinute + "분");
		

	}

}
