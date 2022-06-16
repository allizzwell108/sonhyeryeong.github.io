class MyClass{
	static {//클래스를 로드하는 시점에 읽힌다...?
		System.out.println("테스트테스트");
		MyClass2.hello();
	}
	
	public static int num;
	public  int fields =1000;
}

class MyClass2{
	static void hello() {
		System.out.println(MyClass.num);
//		System.out.println(MyClass.fields); //객체가 생성되지 않아서 읽을 수 없다. 
	}
}



public class Test {
	public static void main(String[] args) {
		System.out.println("시작~~~~");
		MyClass2.hello();
	
	}

}
