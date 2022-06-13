
public class Box {
	int height; //높이
	int length; //길이
	int width; //폭
	
	public Box() {}
	
	//기본 생성자가 아닌 명시적 생성자 일 경우,자식클래스에서는 부모의 생성자를 호출할 수 없어진다!!
	//(자동으로 기본 생성자로 만들어지기 때문이다.) 
	public Box(int width,int length,int height) {
		this.width=width;
		this.length=length;
		this.height=height;
	}
	
	public int getVolume() {
		return width*length*height;
	}
	
	
	public static void main(String[] args) {
		ColorBox cb2= new ColorBox(10,20,30,"Red");
		System.out.println(cb2.width);
		System.out.println(cb2.length);
		System.out.println(cb2.height);
		System.out.println(cb2.color);
		
		
		
		
		
		
		
		
//		Box box1= new Box();
//		box1.width =10;
//		box1.length=10;
//		box1.height=10;
//		
//		System.out.println(box1.getVolume());
//		
//		ColorBox cb1 = new ColorBox();
//		cb1.width=20;
//		cb1.length=20;
//		cb1.height=20;
//		cb1.color="Red";
//		
//		System.out.println(cb1.getVolume());
//		System.out.println(cb1.getColor());
		
	}
}
