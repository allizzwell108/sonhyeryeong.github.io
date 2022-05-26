//구구단
//2단부터 9단까지 
public class Gugudan{
	public static void main(String[] args){
		for(int j=2; j<=9;j++){
			for(int i=1; i<=9; i++){//이너루프 변수이름 < -같으면 안됌!-> 아우터루프 변수이름
				System.out.printf("%d * %d =  %d\n",j,i,j*i);
			}
		}
	}
}