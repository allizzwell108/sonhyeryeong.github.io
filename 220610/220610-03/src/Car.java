//p. 184 예제
public class Car {
	private int speed;//속도
	//중복메소드: 정수버전
	public void setSpeed(int s) {
		speed=s;
		System.out.println("정수 버전 호출");
	}
	//중복메소드: 실수버전
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

	
	
	
}
