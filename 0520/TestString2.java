public class TestString2{
	public static void main(String[] args){
		String hello ="Hello";// 문자열 하나하나가 char 로 이루어져 있다. 순서는 index 라고 부르는데
		//             01234 순으로 index숫자를 가지고있다. 
		
		char h = hello.charAt(0);//0번째 인덱스에 있는 char 하나를 불러와라
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		
		int length =hello.length();//글자가 몇 글자인지 확인하는거 
		System.out.println(length);
	}
}