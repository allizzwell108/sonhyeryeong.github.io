
public interface IFlyable {//인터페이스는 추상적 메소드를 가질 수 있따. 
//	public abstract void fly();
	void fly();//명시적으로 적지 않아도, 무조건 public, abstract 를 자동적으로 가진다.
	
//	int number=10;//필드가 아님!
	
	
//	public void print() {} 일반 메소드는 가질 수 없음.오직!! 추상 메소드만을 가진다. 
}

class Animal{}
//새는 동물이다
class Bird extends Animal{}

//독수리는 날 수 있는 새다
class Eagle extends Bird implements IFlyable{//우측에 구현하고자 하는 인터페이스 이름을 적어준다

	@Override
	public void fly() {
		System.out.println("독수리는 파닥파닥");
	}
	
	
} 

//펭귄은 새다
class Penguin extends Bird{}


class FlyingFish implements IFlyable{
	@Override
	public void fly() {
		System.out.println("날치가 물 위로 남");
	}
}

class Plane implements IFlyable{
	@Override
	public void fly() {
		System.out.println("비행기가 난다.");
	}
}