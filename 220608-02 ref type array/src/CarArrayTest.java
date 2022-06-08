//p.231문제
class Car{
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed=0;
		gear=1;
		color="red";
	}
	
	public void speedUp() {//속도 증가 메소드
		speed +=10;
	}
	public String toString() {//객체의 상태를 문자열로 반환하는 메소드. 
		return "속도: "+speed +" 기어: "+gear+" 색상: "+color;
	}
	
}

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS=5;
		Car[] cars=new Car[NUM_CARS];
		Car c = new Car();
		
		for(int i=0; i<cars.length;i++) {
			cars[i]=c;
		}
		for(Car car:cars){
			c.speedUp();
		}
		for(Car car:cars){
			System.out.println(car);
		}
		
		
		/*
		//생성자를 for문 통해서 여러개 만듬.(배열에 각각의 인덱스에 ) 
		for(int i=0; i<cars.length;i++) {
			cars[i]= new Car();
		}
		//for(Car c:cars){c.speedUp();}
		//for-each문으로도 됨. 
		for(int i=0; i<cars.length;i++) {
			cars[i].speedUp();
		}
		//왜 참조값이 출력 안되고 다 나오지?? 객체를 문자열처럼 다루고자 할 때 toString 이라는 메소드가 자동으로 호출되기 때문이다. 
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		*/
	}

}
