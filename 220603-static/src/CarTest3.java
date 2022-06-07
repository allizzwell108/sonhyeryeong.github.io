class Car{
	private String color;
	private int speed;
	private int gear;
	
	private int id;//자동차 시리얼 번호
	
	// 그냥 변수로 있으면? -> 생성자가 생기면 계속 1으로만 되겠지??
	//필드가 아님!~
	//public으로 사용하지 않는다. 
	private static int numberOfCars=0; //실체화된 car 객체의 수를 위한 정적 변수 
	//공유하고 싶은데 값이 변하지 않아야 하면 상수로 선언한다. 
	public static final int SHARE_NUMBER=22;
	
	
	
	
	public Car(String c, int s, int g) {
		color=c;
		speed=s;
		gear=g;
		//자동차 개수를 증가하고 id 번호를 할당한다. 
		id =++numberOfCars;
	}
	/* 
	 //메소드가 실행되는 시점에서 동적인 어떤 변수가 만들어 지지 않아서??
	 //static 한 것은 필드 값을 가지고 하는게 불가능하다. 
	public static void printColor() {
		System.out.println(color);
	}
	*/
	
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	
	//정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}



public class CarTest3 {	
	public static void main(String[] args) {
		//Car.printStaticNumber();이러면 에러 뜸 why?메소드가 객체인데 출력하는 값은 정적인값이라서. 
		
		/*
		 * Car c1=new Car("blue",100,1);//첫 번째 생성자 홒출 Car c2=new Car("white",0,1);//두 번째
		 * 생성자 호출 int n=Car.getNumberOfCars();//정적 메소드 호출
		 * System.out.println("지금까지 생성된 자동차 수 ="+ n);
		 */
	}

}
