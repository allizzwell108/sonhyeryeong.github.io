
public class Main {
	public static void main(String[] args) {
		
		
		Penguin penguin = new Penguin();
//		IFlyable test = penguin; 연관되지 않아 컴파일 에러가 난다. 
		
		
		
		
		Eagle e = new Eagle();
		Bird b= e;
		Animal a= e;
		IFlyable f= e;
		
		Eagle downCasting = (Eagle)f;
		downCasting.fly();
//		
//		f.fly();
//		
//		
		IFlyable p = new Plane();
//		Eagle test = (Eagle)p; 실행오류가 난다. 
		
		
		
		
//		IFlyable fish = new FlyingFish();
//		
//		p.fly();
//		fish.fly();
	}
}
