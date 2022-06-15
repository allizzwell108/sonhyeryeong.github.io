//도형 
//x좌표
//y좌표

//넓이 구할 수 있음
public abstract class Shape {//추상 클래스-abstract 키워드를 붙여 만든다.
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//추상 메소드-동작에 대한 구체적인 것이 없다.  
	//메소드 body가 비워져 있다. 메소드의 head만 존재함.  
	//추상 메소드는 일반적인 클래스에는 존재할 수 없다. 
	public abstract int getArea(); 
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
		
	
	
}
