//정수 2개를 입력받아 큰수에서 작은수로 나눈 몫과 나머지를 출력하기 
import java.util.Scanner;
public class IfLargeSmall{
	public static void main(String[] args){
		//정수 a,b 입력받기
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 하나를 입력하시오.");
		int a = scan.nextInt();
		System.out.println("두 번째 정수 하나를 입력하시오.");
		int b = scan.nextInt();
		int div;
		int mod;
		
		/*
		선생님이 한거 
		if(a>b){
			int div =a/b;
			int mod =a%b;
			
		}범위안에 안 적는 이유? 출력하는 내용이 수정될 수 있기 때문에 범위 바깥에 하나만 적는다. 
		else{
			int div =b/a;
			int mod =b%a;
			
		}
		System.out.println("몫 :"+ div);
		System.out.println("나머지 :"+ mod);
		
		*/
		if (a!=0 && b !=0)
		{
			if(a>b){
			System.out.printf("%d를 %d로 나눈 몫은 %d이고 나머지는 %d 입니다.",a,b,a/b,a%b);
			}
			else{
			System.out.printf("%d를 %d로 나눈 몫은 %d이고 나머지는 %d 입니다.",b,a,b/a,b%a);
			}//내가 한 거는 출력하는 내용이 수정되면 다 수정해야함.
		}else{
			System.out.println("0을 입력하면 안됩니다.")
		}
		
	}
}