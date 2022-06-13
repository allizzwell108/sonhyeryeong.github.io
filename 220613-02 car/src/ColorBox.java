public class ColorBox extends Box {
	String color;
	
	/* 상속 받는 경우,
	 * 이 과정이 생략되어 있다. 
	public ColorBox() {
		super();//부모의 생성자를 호출하게끔 되어있다. 
		this.color= null;
	}
	*/
	
	public ColorBox(int width,int length,int height, String color) {
		super(width,length,height);// 부모클래스 ...
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}
}
