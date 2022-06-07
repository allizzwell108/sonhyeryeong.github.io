import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
	
	//배열의 모든 원소를 문자열로 표현해서 반환하는 메소드(메소드를 호출하면 문자열 형태로 반환하기)
	static String arrayToString(char[] target) {
		String str="";
		for(int i=0; i<target.length; i++) {
			str +=target[i];
		}
		return str;
	}
	//캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target,char c) {
		for(int i=0; i<target.length;i++) {
			if(target[i]==c) {//if로 되어있어 리턴값이 없다고 인식, else값이 있어야한다. 
				return i;
			}
			return -1;
		}
	}
	
	
	
	public static void main(String[] args) {
		char[] hello = {'H','e','l','l','o'};
		String result =Arrays.toString(hello);//자바에서 가지고 있는 메소드
		System.out.println(result);
		whereIs(hello,'o');
		
//		printArray(hello);
//		String result=arrayToString(hello);
//		System.out.println(result);
		
		/*
		 
		for(int i=0;i<hello.length;i++) {
			System.out.print(hello[i]);
		}
		//위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요
	
		
		  for(int i=0;i<hello.length;i++) { 
		  	if(hello[i]=='o') {
		  		System.out.println("찾았다: "+i); 
		  		} 
		  	}
		 */
//		System.out.println(hello.indexOf['o']);
		
		
		
		
	}
}
