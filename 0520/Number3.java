//3개의 정수를 입력받아
//가장 큰 수를 출력하세요
//숫자2개놓고 생각하기??
import java.util.Scanner;
public class Number3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int max;
		if(a>b){
			if(a>c){
				max=a;
			}else{
				max=c;
			}
		}else{
			if(b>c){
				max=b;
			}else{
				max=c;
			}
		}		
		System.out.println("가장 큰 수는 :"+max);
		
		/*
		생각해보기
		a가 나오는거
		int x = a>b && b>c
		b가 나오는거
		int y = a<b && b>c 
		c가 나오는거 
		int z=a<c && b<c 
		
		
		
		if(a>b && b>c){
			System.out.println(a);
		}
		else{
		
			if(a>b && b>c){
				System.out.println(a);
			}
			else(b>c){
				System.out.println(b);
			}
		}
		
		*/
	}
}