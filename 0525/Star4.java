/*
4.
     *
    ***
   *****
  *******
 *********
 */
 public class Star4{
	public static void main(String[] args){
		int n=0;
		for(int k=1; k<=5;k++){//줄반복
			
		
			for(int i=4;i>=k;i--){///공백 되는거-갈수록 감소하는거 
				System.out.print(" ");
			}
			
			for(int j=0; j<=n;j++){//별 나오는거 - 갈수록 증가하는거 
				System.out.print("*");
			}
				n=n+2;
				System.out.println();
		}
			
			
	}
}
	
 
