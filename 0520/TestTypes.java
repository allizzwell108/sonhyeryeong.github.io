public class TestTypes{
	public static void main(String[] args){
		
		double d =123.456;
		int i=d; //컴파일 에러가 남. 큰 것을 작은것에 담았기 때문에. 손실을 감수하고 타입을 바꾸려면 ()안에 타입을 적어주면 됨.
		System.out.println(i);
		
		
		
		
		
		/*
		short s = 100;
		int i = 1000;// int 에 L을 적어 long 으로 할려고 하면, 이는 컴파일 에러가 난다. 담으려는 수가 상자보다 크기 때문에. 
		long l = 10000;// 숫자에 L을 안적어 주는 이유? 숫자가 크기 때문에 자동으로 자료형의 확장이 일어났기 때문
		
		
		int sum =b + s;
		// sum 을 byte,short에 넣으면 컴파일 오류가 난다.  연산을 하게되면 int 를 따라가기 때문(바뀜)
		//형변환이 일어났다고 하는데, 큰 방향으로 바뀌기에 자료형의 확장이라 한다(자동적으로 일어난다). 
		System.out.println(sum);
		
		*/
		
		/*
		//형변환을 작은 것으로 할려면?-손실의 가능성을 생각하고 변경해야!
		short s = 100;
		int i = (int)32147843647L;// 바꾸고 싶은 타입을 값 앞에()안에 적어줌
		long l = 10000;
		
		
		System.out.println(i);
		*/
		
		
	}
}