import java.util.*;
public class DaysInMonth{
	public static void main(String[] args){
		int month;
		int year =2009;
		int days =0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오: ");
		Scanner scan =new Scanner(System.in);
		month =scan.nextInt();
		
		switch(month){//여러개의 케이스들을 한번에 나열할 수 있다. 
		case 1: 	case 3: 	case 5: 	case 7:
		case 8: 	case 10: 	case 12:
			days=31;
			break;
		case 4: 	case 6: 	case 9: 	case 11:
			days=30;
			break;
		case 2:
			if(!((year%4==0)&&(year%100!=0)) || (year%400==0))
				days=29;
			else
				days=28;
			break;
		default:
			System.out.println("월이 잘못 입력되었습니다.");
			break;//없어도 문장이 끝이기 때문에 끝임. 있어도되고없어도 됨
		}
		System.out.println("월의 날수는 "+ days);
	}
}