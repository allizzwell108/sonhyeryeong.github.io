//"반복"이라는 문자열 5번 출력하기 
public class LoopFor1{
	public static void main(String[] args){
		/*
		//for ( 1.선언구;2.조건문;4.증감식(중괄호 실행되고 마지막.) ){3.조건문이 참일 때 실행되는 문장}
		for (int i=0; i<5; i++){
			System.out.println("출력");
		}//수행하고자 하는 반복이 숫자일 때 for문을 쓴다.<>반복이 조건일 때는 while문을 쓰는 편.  
		// for ()안에 비어 있어도 동작함(true라고 판별함).
			//System.out.println(i);컴파일 에러가 남. why? 변수가 지역변수로 취급되기 때문에 for문에서 사라짐.
		
		//기존 while문은
		int i=0;
		while(i<5;){
			System.out.println("출력");
			i++;
		}
		*/
		
		/*
		//1부터 10까지 출력하기 for문 사용해서.
		for(int i=1; i<=10;i++){// for문 ()안에는 지역변수 취급이므로 위랑 똑같은 변수이름 사용해도 됨.
			System.out.println(i);
		}
		*/
		/*
		//21-30까지 3의 배수 출력하기
		for(int j=21;j<=30;j+=3){
			System.out.println(j);
		}
		*/
		
		//30 29...20까지 역순 출력하기
		for(int i=30; i>=20;--i){
			System.out.println(i);
		}
		
		
		
	}
}