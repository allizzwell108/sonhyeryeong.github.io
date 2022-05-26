public class SwitchCase{
	public static void main(String[] args){
		int i=3;
		
		switch(i){//같은 값을 가지고 있는 것을 찾는다.
			case 1:
			System.out.println("일");
			break;//아래로 쭉 흘러가지만 브레이크문을 만나면 수행이 종료된다. 
			case 2:
			System.out.println("이");
			break;
			case 3:
			System.out.println("삼");
			break;
			default: //해당하는 값을 찾을 수 없을 때 읽는다. (생략가능) else문이랑 비슷한 쓰임.
			System.out.println("일이삼아님");
			
		}
		System.out.println("프로그램 종료");
		
		

		
	}
}