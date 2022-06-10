import java.util.Scanner;

class Can{
	private String name;
	
	
	public Can(String name) {
		this.name= name;
	}
	public String toString() {
		return name;
	}
	
	public static String CanMethod(int a) {// 숫자를 입력받으면 문자열을 반환하는 메소드
		 String c= "콜라";
		 String s="사이다";
		 String f = "환타";
		if(a==1) {
			return c;
		}else if (a==2) {
			return s;
		}else {
			return f;
		}
	}
	
	public static String CanMethod(String b) {// 문자열을 입력받으면 문자열을 반환하는 메소드??
		 String c= "콜라";
		 String s="사이다";
		 String f = "환타";
		if(b.equals(c) || b.equals("cola")) {
			return c;
		}else if(b.equals(s) || b.equals("sprite")) {
			return s;
		}else if(b.equals(f) || b.equals("fanta")){
			return f;
		}else {
			return "유효한 입력이 아닙니다.";
		}
	}
	
	
}

public class Main2 {
	public final int COLA =1;
	public final int SPRITE =2;
	public final int FANTA=3;
	
	//자판기 메소드
	//정수형 1 -> 반환타입이 Can 객체: 콜라
	//1을 입력받으면 -> field "콜라"
	
	//문자열 COLA 로 전달받아 -> 반환타입이 Can
	//"cola" ->field "콜라"
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("원하는 음료를 입력하세요");
		
		System.out.println(Can.CanMethod("콜라"));
		
		
		
		
	}

}
