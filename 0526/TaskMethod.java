// 1.원의 반지름(실수형)을 전달받아 원넓이(실수형)을 반환하는 메소드 작성 후 
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요  파이 r^2

public class TaskMethod{
	
	
	public static double radius(double r){
		return 3.14*(r*r);
	}
	
	
	
	
	
	public static void main(String[] args){
		System.out.println(radius(3.24));
	}
}