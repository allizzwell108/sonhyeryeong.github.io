public class TestMethod3{
	
	public static int getSum(int a, int b){ //parameters:<<개수,타입,순서>> 메소드이름(ㄹㄹ,ㄴㄴ) 괄호 안에 두개를 입력받는 것 .지역변수이다.
		//메소드를 호출할 때,파라미터 타입이 다르면 컴파일 에러가 난다. 
		return a+b;
	}
	//두 개 int 정수를 전달 받아 곱 연산 결과를 반환하는 메소드를 작성하고 호출해 반환값을 출력해보시오.
	public static int method(int a, int b){
		return a*b;
	}
	
	
	public static void main(String[] args){
		int sum=getSum(30,60);// 파라미터로 정수 두개를 입력받을것이라고 했기 때문에 괄호 안에 없으면 컴파일에러가 남. (개수 틀리면 컴파일에러)
		System.out.println(sum);
		
		//System.out.println(a); a는 지역변수이기 때문에 컴파일에러가 남
		
		System.out.println(getSum(100,200));
		
		
		//int method = method(10,20); 생략가능
		System.out.println(method(10,20));
	}
	
	
}