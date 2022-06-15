

interface Hello {
	void Hello();
}


interface EngHello extends Hello{//인터페이스 사이에도 상속할 수 있따. 
	void EngHello();
}

public class Student {
	private String name;
	private int age;
}


class UkStudent extends Student implements Hello{
	@Override
	public void Hello(){
		System.out.println("Hello?");
	}
}

class KorStudent extends Student implements Hello{
	@Override
	public void Hello() {
		System.out.println("안녕하세요?");
	}
}

class UsHuman implements Hello{
	@Override
	public void Hello() {
		System.out.println("WassUp!");
	}
}