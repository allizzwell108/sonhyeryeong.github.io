/*
 5.
 *********
  *******
   *****
    ***
	 *
*/
public class Star5{
	public static void main(String[] args){
		
		int n=0;
			for(int j=1; j<=5; j++){
				for(int k=0;k<j;k++){
					 System.out.print(" ");
				}
				
				for(int i=9;i>n;i--){// 9부터 2개씩 감소해야함. 별의 반복 범위가 한 줄마다 -2씩 줄어들면 됨
					System.out.print("*");
				}
				n=n+2;
				System.out.println();
			}
	
	}
}