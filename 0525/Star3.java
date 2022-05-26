// 3.
    // *
   // **
  // ***
 // ****
// *****
public class Star3{
	public static void main(String[] args){
		
		//공백이 감소하면서 반복, 별이 증가하면서 반복 
		//줄  1	2	3	4	5
		//공백 4  3  2   1   0 	
		//별   1  2  3   4   5
		
		for(int i=1;i<=5;i++){//줄 반복
		
			for(int j=5;j>i;j--){//공백반복
				 System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){//별 반복
				System.out.print("*");
			}
			System.out.println();
		}	
			
	}
}	