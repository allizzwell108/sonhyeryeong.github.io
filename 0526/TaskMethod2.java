//2.전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드 (반환값 없음 :리턴타입 void)
public class TaskMethod2{
	public static void hello(int i){
		for(int j=0; j<i;j++){
			System.out.println("안녕!");
		}
	}
	public static void main(String[] args){
		hello(11);
	}
}