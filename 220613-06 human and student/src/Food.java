//p.264 5번문제

public class Food {
	private int kcal;
	private int price;
	private int weight;
	
	public Food() {}
	public Food(int kcal, int price, int weight) {
		super();
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String toString() {
		return "칼로리: "+kcal+"\n가격: "+price+"\n무게: "+weight;
	}
	
public static void main(String[] args) {
	Food f= new Food();
	f.setKcal(569);
	f.setPrice(9800);
	f.setWeight(56);
	
	System.out.println(f.toString());
	Melon m= new Melon("대저농원");
	m.setKcal(564);
	m.setPrice(5900);
	m.setWeight(56);
	
	System.out.println(m.toString());
	
	
	
}	
}
