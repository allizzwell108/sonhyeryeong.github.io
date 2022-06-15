//삼각형//중심점(x,y)//밑변//높이

//직사각형//중심점(x,y)//가로//세로

//원//중심점(x,y)//반지름

//모두 넓이를 구해서 알려줄 수 있음. 

public class Main {

	public static void main(String[] args) {
		//추상클래스는 인스턴스화 할 수 없다!!!
//		Shape s1= new Shape();
//		Shape s2= new Shape(10,20);
		
//		Rectangle r = new Rectangle(0,0,10,10);
		Shape r = new Rectangle(0,0,10,10);//이렇게도 됨
		System.out.println(r.getArea());
		
		
		Shape c= new Circle(0,0,5);
		System.out.println(c.getArea());
		
		
//		Triangle t = new Triangle(0,0,5,5);
//		System.out.println(t.getArea());
//		
//		
//		Shape s = t;
//		System.out.println(s.getArea());
	}

}
