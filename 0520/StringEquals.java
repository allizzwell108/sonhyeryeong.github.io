public class StringEquals{
	public static void main(String[] args){
		String a ="Hello";
		String b ="Hello";
		String llo ="llo";
		
		System.out.println(a==b);// 값을 확인하는 것이 아니라 참조하는 대상이 같은지 확인하는 것임. 
		
		
		System.out.println(a==("He"+llo));
		//관계연산자를 통해서는 문자의 값이 같은지 비교할 수 없다.!!
		
		System.out.println("------문자열 값 동등 확인--------");
		System.out.println(a.equals("He"+llo));//equals 메소드
		
	}
}