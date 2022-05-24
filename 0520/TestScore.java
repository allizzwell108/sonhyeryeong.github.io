//사용자의 학점
//점수를 입력받아
//90점 이상 A
//80이상90미만 B
//70이상 80미만 C
//60이상 70미만 D
//60점 미만 F

import java.util.Scanner;
public class TestScore{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = scan.nextInt();
		
	
		String it="";/*if 절은 실행이 될 수도 실행이 안될수도 있기 때문에 초기화를 하지 않으면 
		안된다고 인식하고 컴파일 오류를 띄운다.
		else절이 있으면 초기화 하지 않아도 실행이 되는 문제가 하나 있기 때문에  컴파일 오류가 안 뜬다*/
		
		if (score >=90){
			it="A";
		}else if(score>=80){
			it="B";
		}else if(score>=70){
			it="C";
		}else if(score>=60){
			it="D";
		}else {
			it="F";
		}
		
		System.out.println("당신의 학점은" + it + " 입니다.");
	}
}