import java.util.Scanner; 
public class Gugudan{
	public static void main(String[] args) {
		
		// 사용자의 입력을 받아 원하는 단수의 구구단을 출력하는 프로그램
		
		// 사용자가 원하는 단수 입력받고 , 그 숫자로 쫙 
		Scanner input =new Scanner(System.in);
		System.out.println("원하는 단수를 입력하시오: ");
		int a = input.nextInt();
		//b는 어디까지 반복할건지
		int b=1;
		while(b<=10){
			System.out.printf("%d*%d = %d\n",a,b,a*b);
			b++;
		}
		
		
		
		
		
		/*
		
		//구구단 4단 보여주기
		//4*1=4, 4*2=8 이런식으로 보여줘야함.
		//선생님이 한 거 
		int j=1;
		while(j<=9){
			System.out.printf("%d*%d=%d\n",4,j,4*j);
			j++;
		}
		
		//내가한거
		int i=0;
		while(i<=100){
			if(i%4==0){
			System.out.println(i);
			}else{
				
			}
			i++;
		}
		
		*/
		
		
		
	}
}