//사용자가 몇 개의 정수를 입력할지 먼저 정한 후, 
//정수를 입력하면 합과 평균을 구해 출력하는 프로그램. 

import java.util.Scanner;
public class SumAverage{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		//입력할 정수 갯수,정수 입력 받는거, 입력받은 정수 합, 정수 평균, 출력
		//짝수입력의 평균
		//홀수입력의 평균
		
		System.out.println("몇 개의 정수를 입력할 지 갯수를 입력하시오:");
		//정수 몇개 입력할 지 
		int x =scan.nextInt();
		
		int sum=0;//짝수 합
		int sum2=0;//홀수 합
		int i=1;
		int j=1;
		for(int y =0; y < x ; y++){ 
			int num=scan.nextInt();
			if(num%2==0){
				sum+=num;
				i++;
			}else{
				sum2+=num;
				j++;
			}
		}
		//짝수 홀수 각 몇개 입력했는지??if문 숫자를 셀 수 없나??
		System.out.printf("입력한 짝수의 평균은 %d이고, 홀수의 평균은 %d이다.",sum/i,sum2/j);
		
		
		
		/*
		for(int y =0; y < x ; y++){// y는 몇 번 반복할 지 : 사용자가 입력한 수만큼 반복해야함 
			sum+= scan.nextInt();//사용자 입력 정수 *위에 선언 안하고 그냥 바로 적어주기
			avg= sum/x;//**어차피 평균에 필요한 수는 다 나와있기 때문에 변수선언이 필요없다
		}
		
		System.out.printf("입력한 정수의 합은 %d이고, 정수의 평균은 %d이다.",sum ,sum/x);
		//확인 완료
		*/
	}
	
}