public abstract class MySubClass extends MyClass {//추상 클래스를 상속 받는 추상 클래스
	
	@Override
	public final void myMethod() { //final 키워드로 override가 불가능하게 할 수 있다. 
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2();
	
}
