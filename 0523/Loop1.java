//1~10까지 출력
public class Loop1{
	public static void main(String[] args) {
		//반복 몇 번 해라, ~가 될 때 까지 해라, 조건을 충족할 때 까지 해라 등등
		boolean con =true;
		//whlie 문은 조건식이 참일 때 중괄호를 실행하고, 다시 조건식을 검사하러 온다. 조건식이 거짓일 때 종료됨.
		int i=0;
		while(i < 5){
			System.out.println("반복됩니다");
			i++;
		}//종료시킬려면 컨트롤씨 누르기
		
		//hello world 10번 출력
		
		int j=0;
		while (j<10){
			System.out.println("Hello World");
			System.out.println("j의 값: "+ j);
			j++;
		}
		
		//1-10까지 출력
		
		int k =1;
		while(k<=10){
			System.out.println(k);
			k++;
		}
		
		
		
		
		
		
		
		
	}
}