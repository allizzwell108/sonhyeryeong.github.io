interface PrintAll{
	void printAll();
}




public class Main {
	public static void main(String[] args) {
		PrintAll a=new PrintAll() {//인터페이스를 클래스처럼 취급해서 인스턴스화??시킨다
			@Override
			public void printAll() {
				System.out.println("출력할 내용이 없습니다.");
			}
			
		};
		a.printAll();
		
		
		
//		class Point implements PrintAll {//지역클래스라고 부른다.
//			int x;
//			int y;
//			public Point(int x, int y) {
//				super();
//				this.x=x;
//				this.y=y;
//			}
//			@Override
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//			
//		}
//		
//		Point p = new Point(10,20);
//		p.printAll();
		
		
		
		
		
		
		
	}
}
