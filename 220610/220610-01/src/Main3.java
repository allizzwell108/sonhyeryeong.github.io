
public class Main3 {
	public static void main(String[] args) {
		int number1=10;//값만 가지고 있는거라서 참조할 수 없다!
		int number2=20;
		//이렇게 되면 값을 비교할 때 if 문으로 써야함. 
		
		
		Integer refNumber = Integer.valueOf(10);// Integer참조라서 참조할 수 있다!
		refNumber.compareTo(20); 
		//객체이기 때문에 메소드 사용으로 비교가 가능함. 
		
		// 스캐너로 사용자 입력 받는 걸 Integer 로 가능한가?? 
		
//		Integer a= 10;
//		Integer b= 20;
//		System.out.println(a+b); 30이 나온다. 객체라도 숫자 값이라서
//		System.out.println(a+b+"맞나?");
		
		
	}
}
