import java.util.Scanner;

//p.237 1번
public class Task1 {
	//배열을 이용해 극장예약 시스탬을 작성하자. 좌석이10개
	//사용자가 예약하려하면 좌석배치표 보여줌. 
	//예약이 끝난 좌석은 1로 예약 안된건 0으로 

	//배열의 길이가 10인 배열 하나->좌석.
	// 예약 된 좌석은 1 아니면 0 -> 초기값 무작위
	// 배열 하나씩 확인하면서 이게 1인지 0인지를 따져야 함. 
	//사용자가 원한 좌석 입력-> 입력값을 받아서 그 배열의 배열??
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//현재 좌석 배열
		//1또는 0으로 구성되어 있어야 한다. 
		//초기값 일단 모두 0으로
		int[] present = new int[10];
		for(int i=0; i<10;i++) {
			present[i]=0;
		}
		
		
		
		
		
		
		while(true) {
			System.out.println("좌석을 예약 하시겠습니까?(1 입력: 예약 / 0 입력: 종료");
			int a= scan.nextInt();
			
			
			if(a==1) {//예약한다고 할 때. 
				
				System.out.println("현재의 예약 상태는 다음과 같습니다. ");
				System.out.println("------------------------------\n"
						+ "1 2 3 4 5 6 7 8 9 10\n"
						+ "------------------------------");
				for(int i:present) {	System.out.printf("%d ",i);}
				
				
				//몆번 좌석을 예약할 지 물어야 함 
				System.out.println("몆번째 좌석을 예약하시겠습니까? ");
				int whatChair = scan.nextInt();// present배열의 값이 1인지 확인해야함. 
				
				if(present[whatChair-1] == 0) {
					System.out.println("예약되었습니다.");
					present[whatChair-1]=1;
				}
				else {
					System.out.println("이미 예약된 좌석입니다. 프로그램을 종료합니다.");
					break;
				}
				
				
			}
			
			
			else if(a==0) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}
		
		}
		
		
		
		
		
		
		
	}
}
