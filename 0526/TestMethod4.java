import java.util.Scanner;
public class TestMethod4{
	//정수 하나를 전달 받아 1~100사이의 수이면 true를 반환하고, 아니면 false를 반환하는 메소드 작성
	
	//리턴타입 메소드이름(파라미터(개수,타입,순서))
	public static boolean method(int a){
		if(a>=1 && a<=100){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	//사용자가 점수 입력을 국어,영어 수학 순으로 하는데  사용자 입력값은 점수는 무조건 1~100사이어야함 
	//입력한 점수와, 점수 합을 출력해보세요
	
	public static boolean between(int number){
		if(number>=1 && number<=100){
			return true;
		}else{
			return false;
		}	
	}
	
	
	
	
	
	public static void main(String[] args){
		// System.out.println(method(111));
		
		
		//스캐너 선언 초기화
		Scanner scan= new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		
		
		do{
			//국어점수 입력받기
			System.out.println("국어점수?");
			kor=scan.nextInt();
			
		}while(!(between(kor))); //범위가 맞으면 다음, 아니면 다시 입력	
		
		do{
			//영어점수 입력받기
			System.out.println("영어점수?");
			eng=scan.nextInt();
		}while(!(between(eng)));//범위가 맞으면 다음, 아니면 다시 입력
		
		do{	
			//수학점수 입력받기
			System.out.println("수학점수?");
			math=scan.nextInt();
		}while(!(between(math)));//범위가 맞으면 다음, 아니면 다시 입력
		
		//합 구하기
		int sum=kor+eng+math;
		
		
		//국어영어수학 점수출력
		System.out.println("국어점수: "+ kor);
		System.out.println("영어점수: "+ eng);
		System.out.println("수학점수: "+ math);
		//합 출력
		System.out.println("총합: "+ sum);
		
		
		

		
		
	}
}