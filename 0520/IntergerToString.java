public class IntergerToString{
	public static void main(String[] args){
		String strNum= String.valueOf(12345); //숫자를 문자열로 바꾸는 작업
		System.out.println(strNum);
		
		String strNum2 = ""+12345; //숫자를 문자로 바꾸는거. 위랑 똑같음
		
		int i = 5055;
		String strNum3 = ""+i;
		
		System.out.println(strNum3.charAt(0));
		
	}
}