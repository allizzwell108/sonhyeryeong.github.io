
public class ToyFactory {
	private String location;
	
	public ToyFactory(String location) {
		this.location=location;
	}

	public static Toy makeToy() {
		return new Toy("처키인형,생산지",10000);
	}
}
