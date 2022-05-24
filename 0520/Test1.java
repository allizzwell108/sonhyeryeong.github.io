//사용자에게 정수를 입력받아
//짝수면 "짝수입니다" 출력하기

import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		/*
		if(조건식){
			//문장1
			//문장2
		}참일 경우-> 문장1 문장2 문장5 가 수행됨. 
		else{
			//문장3
			//문장4
		}
		//문장5
		거짓일 경우->문장3문장4문장5 가 수행됨.
		*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int number=scan.nextInt();
		
		
		if(number%2 == 0){
			System.out.println("짝수입니다.");
		}
		else{
			System.out.println("홀수입니다. ");
		}
		
	}
}