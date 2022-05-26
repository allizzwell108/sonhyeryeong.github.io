
public class StringSwitch{
	public static void main(String[] args){
		String month ="february";
		
		int monthNumber;
		switch(month){// 스위치문은 이퀄메소드를 사용하지 않고도 문자열 비교 가능
		case "january":
			monthNumber=1;
			break;
		case "february":
			monthNumber=2;
			break;
		case "march":
			monthNumber=3;
			break;
		default:
			monthNumber=0;
			break;
		}
		System.out.println(monthNumber);
	}
		
}
	
