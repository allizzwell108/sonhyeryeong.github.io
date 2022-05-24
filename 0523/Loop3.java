//0부터 100사이 수 중 3의 배수 또는 7의 배수를 출력해보시오.
// 예) 3 6 7 9 12 14 15,,,,
public class Loop3{
	public static void main(String[] args) {
		/*
		// 3의 배수, 7의 배수 둘 다 출력해야함 : or 로 조건 묶기 , 
		//선생님 풀이
		int j=0;
		while(j<=100){
			if(j%3==0 || i%7==0){
				System.out.println(j);
			}
			j++;
		}

		//내가한거. Q. false 일 때 내용 없는게 어떻게 하는지 모르겠다. 
		int i=3;
		while(i<=100){
			System.out.println((i%3==0) || (i%7==0) ? i : "");
			i++;
		}
		*/
		
		//0부터 100사이 수 중 일의 자리 수가 3,6,9 일떄만 출력해보시오
		
		
		int q =0;
		while(q<=100){
			if (q%10== 3 || q%10== 6 || q%10== 9){
				System.out.println(q);
			}
			q++;
		}
		
		
		
		
		
		
		
		
		
		//k의 일의 자리 수가 3,6,9여야함. 일의 자리 수 구해서, 3,6,9이도록 or연산자 쓰기 
		//k를 문자열로 바꿔서 lastindexOF 써서 1의 자리 수 비교하기 
		// int k=0;
		// while(k<=100){
			// System.out.println();
			// k++;
		// }
		// if(){
			// String num=""+k
			// (k.lastIndexOf(1)==3) || (k.lastIndexOf(1)==6) ||(k.lastIndexOf(1)==9) 
		// }
		
		
		
	}
}