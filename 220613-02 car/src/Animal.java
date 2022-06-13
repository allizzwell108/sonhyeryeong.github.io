
public class Animal {
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	public void eat() {
		System.out.println("밥을 잘 먹어요");
	}
	
	
	public static void main(String[] args) {
		Cat c= new Cat();
		c.sleep();
		c.eat();
		c.play();
		
		Dog d = new Dog();
		d.sleep();
		d.eat();
		d.bark();
	}
	
}
