//사용자가 입력한 영단어에서 모음(a e i o u )이 몇개인지 출력하세요
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("영단어를 입력하세요: ");
		String eng = scan.nextLine();
		//입력받기
		
		//모음을 찾기 인덱스값으로 찾으면 됨
			eng.indexOf("a");
			eng.indexOf("e");
			eng.indexOf("i");
			eng.indexOf("o");
			eng.indexOf("u");
		
		
		// 모음의 갯수??? 인덱스값이 음수가 아닌 것의 갯수!!! 
		//단어에 같은 모음이 여러개면?? >반복해야함> 단어 길이만큼 반복!
		 int count=0;
		 for (int i=0; i< eng.length();i++){
				if(eng.indexOf("a")!=-1){
					count+=1;
					}
					else{
						count=0;
					}
				System.out.println(count);
		 }
		 
		 
		 
		 
		 /*
		 for (int i=0; i< eng.length();i++){
			 if(eng.indexOf("a")>=0){
				 count++;
				 System.out.println(count);
			 }
			 
		 }
			*/
			
	
		
		
		
	
		
		
	}
}