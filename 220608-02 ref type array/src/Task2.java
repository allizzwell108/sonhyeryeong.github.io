import java.util.Arrays;
import java.util.Scanner;
//p.237쪽
//입력값의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램 작성하기. 
//이 프로그램은 1-100사이 정수 10개를 읽어야 하고 1-10, 11-20 범위에 드는 값들의 횟수를 *로 출력해야 한다. 









public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 사용자 입력받은 값 배열
		System.out.println("정수 10개를 순서대로 입력하여 주세요");
		int[] userInput = new int[10];
		for(int i=0; i<10;i++) {
			userInput[i] = scan.nextInt();
		}
		
		//입력 받은 0-9의 인덱스를 가지는 userinput 값이 1-20, 11-20 ,,,,에 있는지 비교해야함. 
		int[] count= new int[10];//범위 값에 몇개인지 
		//비교를 반복해서 해야함.
		//범위 값에 몇개인지를 배열로 저장할 수 있나??
		//1-10까지 사용자가 입력한 수가 포함되는지를 반복
		//확인을 반복한 수!-count 배열에 집어넣기 
		int x=0;
		
		for(int j=0; j<=100; j=j+10) {// 1-10, 21-30,30-40,,, 비교하는 반복문
			for(int i=0; i<10; i++) {//사용자 입력배열 나열
				if(userInput[i]>=j+1 && userInput[i]<=j+10) {
					x++;
				}
			}
			for(int k=0; k<10;k++) {
				count[k]=x;
			}
		}
		
		
		System.out.println(Arrays.toString(count));
		
		
		
		
		//카운트 배열이 가지는 값 만큼 별을 찍어야 함. 
		//
		
//		count[0]=0 - 별 0 (1-10)
//		count[1]=3 -별3 (11-20)
//		count[2]=2 -별2 (21-30)
//		count[3]=3 -별3 (31-40)
//		count[9]=0 
//		int x=0;
//		for(int k=0; k<10; k++) {
//			System.out.printf("%d-%d: ",x+1,x+10);
//			for(int r=0; r<count[k]; r++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			x +=10;
//		}
//			
		
		
		
		
		
	}

}
