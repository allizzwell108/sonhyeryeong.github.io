//컵라면
//제조사
//이름 
//가격

//override
//toString
//equals-제조사와 이름이 같으면 


public class Noodle {
	private String madeBy;
	private String name;
	private int price;
	
	public Noodle() {}
	public Noodle(String madeBy, String name, int price) {
		super();
		this.madeBy = madeBy;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "제조사: " + madeBy + "\n이름: " + name + "\n가격: " + price + "원";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Noodle) {
			return madeBy.equals(((Noodle)obj).madeBy) && name.equals(((Noodle)obj).name);
		}else {
			return false;
		}
	}
	
	
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
