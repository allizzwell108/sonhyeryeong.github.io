
public class Main {
	public static void someMethod(int param) {
		
	}
	//메소드는 파라미터도 같이 따지기 때문에 메소드 이름이 같아도 구분할 수 있다. 
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
		
	public static void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("ddd");
		//이건 동작 안되느ㅏㄴ게
		
		//Method Overloading 
		// 이건 왜 동작할까? 
//		System.out.println(12151);
//		System.out.println(12.54565);
//		System.out.println("1243.d");
		
		sum(50,20);
		sum(10.0,40.0);
		
		
		
		
	}

}
