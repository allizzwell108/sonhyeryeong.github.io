public class Methods{
	//숫자 하나가 짝수, 홀수인지 알고 싶음. 이 기능을 할 수 있는 메소드가 하나 있었으면 좋겠음. 
	//리턴타입 이름(파라미터)
	//논리값 짝수홀수?(정수하나)
	
	// int isEven(int)
	
	// char isEven(int)
	
	// public static void isEven(int){
		// return;
	// }
	
	public static boolean isEven(int b){//짝수면 참, 홀수면 거짓
		return b%2==0;
		
	}
		



	
	public static int increase(int a){
		a++;
		return a;
	}
	
	// public static int, int createTwoNumber(){//메소드는 리턴 값을 하나만 가질 수 있다. void는 없는 값을 하나 리턴하는거라고 생각하기
		// return 20,30;
	// }
	
	// public static boolean test(){리턴타입과 리턴하고자 하는 값이 일치하지 않아 컴파일 에러가 발생한다. 
		// return 10;
	// }
	
	public static void main(String[] args){
		int a=10;
		increase(a);// Call By Value 메소드를 호출할 때는 변수의 값이 복사되서 전달된다??
		
		if(isEven(6)==true){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println(increase(a));// 이건 메소드의 a값이 프린트 되는거고
		System.out.println(a);//이건 메인메소드 a의 값을 프린트한거
	}
}