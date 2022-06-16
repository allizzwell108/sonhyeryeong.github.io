
public interface Days {
//	public static final int NUM =10;//상수들을 정의해놓고 쓰는 용도로도 인터페이스를 쓸 수 있다. 
	//앞에 ( public static final) 이 생략된 형태로 써도 상수처럼 사용된다. 
	public static final int MONDAY=1;
	public static final int TUESDAY=2;
	public static final int WENDSDAY=3;
	
}

interface MyInterface{
	default void printHello() {//default :인터페이스에서 기본값으로 정해놓을 수 있다. 
		//override를 무조건 해야 했는데 , 좀 더 편하게 하려고 만들어 놓은 것. 
		System.out.println("Hello");
	}
	
	public static String hello() {
		//
		return "Hello";
	}
	
	public static void myStaticMethod() {
		//static한 메소드 
		
	}
	
	static int sum(int a, int b) {//인터페이스는 private는 불가능하게 되어있다(자바9버젼부터는 private가능!)
		return a+b;
	}
}