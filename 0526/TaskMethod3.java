// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드. 

public class TaskMethod3{
	public static int wordLength(String x,String y){
		
		String plus=x+y;
		return plus.length();
		
		
	}
	public static void main(String[] args){
		String w="아제발좀";
		String f="조용히좀해라";
		
		System.out.println(wordLength(w,f));
	}
}