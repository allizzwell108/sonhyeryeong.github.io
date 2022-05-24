//사용자의 정수를 입력받아 200이상이면 large
//100이상-200미만 medium
//100미만 small

import java.util.Scanner;
public class TestElseif{
	public static void main (String[] args){
		int cup=150;
		
		String size;
		if(cup >= 200){
			size="large";	
		}else if(cup>=100){
			size="medium";
		}else if(cup<100){
			size="small";
		}
		
		System.out.println(size);
	}
}