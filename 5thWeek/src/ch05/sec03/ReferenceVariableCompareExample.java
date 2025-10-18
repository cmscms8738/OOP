package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // 배열 속 원소는 모두 같지만 다른 객체를 참조하기에 false
		System.out.println(arr2 == arr3); // arr2 객체를 복사했기에 주소도, 원소도 모두 동일 즉, true
	}
}
