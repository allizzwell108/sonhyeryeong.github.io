//직사각형//중심점(x,y)//가로//세로
public class Rectangle extends Shape{
	private int length;
	private int height;
	
	public Rectangle(int x, int y, int length, int height) {
		super(x, y);
		this.length = length;
		this.height = height;
	}
	
	
	@Override
	public int getArea() {
		return (length*height);
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", height=" + height + "]";
	}


	
	
}
