//class Test extends MyImpleClass{} 종단 클래스로 선언하여 주었기 때문에 상속이 불가능 하다. 

//종단 클래스로 선언하여 주면 이 클래스의  상속이 불가능 하다. 
public final class MyImpleClass extends MySubClass {//종단 클래스로 정의하려면 final 키워드를 사용하면 된다. 
	
	@Override
	public void myMethod() {// final메소드 선언을 해주었기 때문에 override 가 불가능 하다. 
		System.out.println("새롭게 재정의를 하였습니다. ");
	}
	
	
	@Override
	public void myMethod2() {
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m= new MyImpleClass();
		m.myMethod();
		
		MySubClass sub=(MySubClass) m;
		sub.myMethod();
		sub.myMethod2();
	}
	
	
}
