//사용자의 나이와 이름을 입력받아
//자기랑 같으면 true

import java.util.Scanner;

public class Age{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	
	 System.out.println("나이를 입력하시오: ");
	 int age = scan.nextInt();
	 System.out.println("이름을 입력하시오: ");
	 scan.nextLine();
	 String name = scan.nextLine(); // nextLine(한줄을 가져오고 엔터를 구분자로 )<>next( 한 단어를 가져오고 스페이스를 구분자로)
	 
	 
	 System.out.println(age == 28 && name.equals("손혜령"));
	
	 }
}