//문자열 ,참조형- 대문자로 시작함(클래스라서). 
public class TestString{
	public static void main(String[] args){
		String str;
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2);
		
		String concat = str +(1+2)+"\n"+true+s2+3.0; // 숫자도 문자열 취급됨 
		System.out.println(concat);// 문자열끼리 결합됨. 
	}
} 