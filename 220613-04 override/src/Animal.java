public class Animal {
	public void sound() {
		System.out.println("동물들은 집에 가고 싶습니다. ");
	}
}

class Dog extends Animal{
	@Override // annotation:override 시에 명시적으로 적으면 컴파일 할 때 알아볼 수 있다. 
	public void sound() {//method override :부모 클래스에 있는 메소드를 헤더를 그대로 적어서 바디 부분만 구체화시켜놓은 방식.  
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	public void sound() {//헤더를 그대로 적어준다. 
		System.out.println("냥냥");
	}
	
}

//클래스 간의 관계를 클래스 다이어그램을 작성하여 파악한다. 