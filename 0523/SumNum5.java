//사용자 입력 5개의 정수의 합 구하기. 
import java.util.Scanner;
public class SumNum5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		//입력
		System.out.println("정수 5개를 차례대로 입력하시오: ");
		int sum =0;
		for(int i=0; i<5;i++){
			int num = scan.nextInt();
			//연산
			sum+=num;
		}//반복문으로 간단하게!
		//출력
		System.out.println(sum);
	}
}