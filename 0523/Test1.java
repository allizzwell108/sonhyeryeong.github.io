//2의 제곱수를 32개 나열하고 결과값을 확인해보세요
//2 4 8 16 64 ,,,,
public class Test1{
	public static void main(String[] args){
		
		//제곱근 만큼 2를 곱해야 한다. 
		//그 수를 나열해야함
		// 2*2 2*2*2 2*2*2*2 
		//곱하기 숫자를 반복문으로?? 하나씩 계속 곱하도록???
		int number=1;
		for(int i=2; i<32;i++){
			if(i%2==0){
				number *=2;
				System.out.println(number);
			}
			
		}
		
	}
}


