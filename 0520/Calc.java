//정수 2개와 연산자(문자열) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램
import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 하나를 입력하세요: ");
		int a=scan.nextInt();
		System.out.println("두 번째 정수 하나를 입력하세요: ");
		int b=scan.nextInt();
		System.out.println("연산자 하나를 입력하세요: ");
		scan.nextLine();
		String c = scan.nextLine();
		
		//확인완료
		int calc=0;
		if(c.equals("+")){
			calc=a+b;
		}else if(c.equals("-")){
			calc=a-b;
		}else if(c.equals("*")){
			calc=a*b;
		}else if(c.equals("/")){
			calc=a/b;
		}
		
		System.out.println("입력한 숫자를 계산하면: "+calc);
	}
}