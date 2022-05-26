//주민번호를 입력하면 
//성별을 출력하는 프로그램
//xxxxxx-1xxxxxx 
import java.util.*;
public class Number{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println("주민번호를 입력하시오. \n입력 양식:xxxxxx-xxxxxxx");
		String id =scan.nextLine();
		char gender =id.charAt(7);
		
		if(id.length()==14){
			//성별출력
			switch(gender){
			case '1':
				System.out.println("남성입니다.");
				break;
			
			case '2':
				System.out.println("여성입니다.");
				break;
			
			default: //만약 초기화를 하지 않고 변수 선언만 했을 경우, 디폴트가 없으면 변수 초기화가 안되는 경우가 있기 때문에 컴파일 에러가 날 수도 있다. 
				System.out.println("잼민이 입니다. ");
			}
		}else{
			System.out.println("잘못 입력했습니다.");
		}
	}
}