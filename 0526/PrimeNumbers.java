public class PrimeNumbers{
	
	public static boolean isPrime(int i){//리턴타입은 불연(참거짓으로 값을 돌려준다), 파라미터는 정수
		int count=0;
		for(int j=1; j<=i;j++){
			if(i%j==0){
				count++;
			}
		}
		if(count==2){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public static void main(String[] args){
		for(int i=2;i<10000; i++ ){//2~10000
			boolean result=isPrime(i);//소순지 알아본다.- 참, 거짓으로 반환
			if(result){//참이면
				System.out.println(i);//출력
			}
		}
	}
}