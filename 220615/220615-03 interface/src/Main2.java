
public class Main2 {
	public static void main(String[] args) {
		UkStudent uk = new UkStudent();
		//인터페이스 형으로 인스턴스를 참조하여 인사시켜 보기
		Hello kor= new KorStudent();
		Hello us = new UsHuman();
		
		//배열로?
		//object로  타입을 지정하면 다른 타입도 다 담을 수 있다.
		//인터페이스도 타입으로 사용할 수 있기에 배열로 선언할 수 있다. 
		//인터페이스에 배열 인스턴스가 만들어진??잉???
		//new Hello();로 인스턴스를 만들 수 없다...?
		Hello[] arr= new Hello[3];
		arr[0]= uk;
		arr[1]=kor;
		arr[2]=us;
		
		for(int i=0; i<arr.length; i++) {
			arr[i].Hello();
		}
		
		
		
		uk.Hello();
		kor.Hello();
		us.Hello();
		
		
	}
}
