//책 96쪽
public class TypeConversion{
	public static void main(String[] args){
		int i;
		double f;
		
		f= 5/4;
		System.out.println(f);// 1.0이 출력
		f = (double) 5/4;//형변환이 먼저 일어나서 5.0 그리고 확장을 통해 4.0으로 됨.
		System.out.println(f);// 1.25출력
		f = 5/ (double)4;
		System.out.println(f);//1.25출력
		f = (double)5/ (double)4;
		System.out.println(f);//1.25출력
		i = (int)1.3 + (int)1.8;// 형변환하면서 손실이 일어남. 
		System.out.println(i);// 2가 출력
		i = (int)(1.3+ 1.8);// 괄호 먼저 계산-> int 로 형변환됨
		System.out.println(i);//3이 출력
	}
}