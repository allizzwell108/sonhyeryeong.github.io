import java.util.Scanner;
public class SumForUser{
	public static void main (String[] args){
		//사용자가 범위를 지정(시작-끝)
		//해당 범위 정수의 합.
		Scanner scan= new Scanner(System.in);
		System.out.println("시작 숫자를 입력하세요:");
		int start = scan.nextInt();
		System.out.println("끝 숫자를 입력하세요:");
		int end = scan.nextInt();
		
		//시작범위 끝 범위 더하기
		int sum=0;
		for (int c= start; c <= end ; c++){
			sum += c;
		}
		System.out.println(sum);
		
		
		
	}
}