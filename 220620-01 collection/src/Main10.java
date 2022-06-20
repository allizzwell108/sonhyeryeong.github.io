import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과","포도","오렌지","배","수박"));
		Scanner scan = new Scanner(System.in);
		//콘솔 입출력
		//과일목록 보여주기
		//과일주기(제일 앞에거부터 줌)
		//재고 과일 추가하기(제일 마지막에 추가)-진열갯수 최대10개
		
		
		while(true) {
			System.out.println("1번. 과일 목록 보기   2번. 과일 주기  3번. 재고 과일 추가");
			int userInput = scan.nextInt();
			Iterator<String> iterator =list.iterator();
			
			if(userInput==1) {
				System.out.println("과일 목록:"+ list);
				continue;
			}
			if(userInput==2) {
				list.remove(0);
				
			}else if(userInput==3) {
				
				if(list.size()<=10) {
					
						System.out.println("몇개를 추가할 지 입력하세요: ");
						int x= scan.nextInt();
						if(x+list.size()<=10) {
							System.out.println("추가할 과일을 입력하시오: ");
							scan.nextLine();
							String plus = scan.nextLine();
							list.add(plus);
						}else {
							System.out.println("너무 많습니다. 다시 입력하세요");
							continue;
						}
						
					
					
					
				}else {
					System.out.println("더 이상 추가할 수 없습니다.");
				}
					
					
			}
			System.out.println("과일목록: "+list);
		}
	}
		
}


