public class BlockScope{
	public static void main(String[] args){
		int a =10;//이것도 지역변수
		{//지역변수: 이 범위 안에서 변수가 끝남-사라짐.
			int b=20;
			
			//int a = 99; 위에 있는 a의 범위가 이 범위를 포함하고 있기 때문에 컴파일 에러가 남. 
			System.out.println("가능?");
			System.out.println(a);
			System.out.println(b);
		}//중괄호로 만들어진 범위(scope)를 "block"이라고 한다. 
			
			System.out.println(b);//컴파일에러 뜸 cannot find. 
		
	}
}