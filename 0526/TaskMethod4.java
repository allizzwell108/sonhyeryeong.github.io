// 4.키(실수,미터단위)와 몸무게(실수,kg단위)를 전달받아 한국기준 bmi지수(실수)구해 반환하는 메소드
// bmi지수= (몸무게)/(키^2)


public class TaskMethod4{
	//실수를 반환해야함. 파라미터는 실수
	public static double bmi(double m, double kg){
		return kg/(m*m);
	}
	
	public static void main(String[] args){
		System.out.println("BMI지수는 : " +bmi(1.63,50.5) );
	}
}