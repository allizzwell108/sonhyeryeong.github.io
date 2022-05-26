//2-100까지 모든 소수 출력하기
public class PrimeNumber{
	public static void main(String[] args){
		//소수는 1과 자신으로만 나누어짐
		//다른사람 풀이. 
		for(int j=2;j<=100;j++){
			
			int count=0;
			for(int i=1; i<=j; i++){
				if(j%i==0){
					count++;
				}
			}
			
			if(count==2){
				System.out.println(j);
			}
		
		}
	}
}