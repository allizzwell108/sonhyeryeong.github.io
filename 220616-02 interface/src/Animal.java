//동물 공통 super클래스 
public class Animal {
	String species;
	private int age;
	private int weight;
	private boolean eating; // 육식이면 true, 초식이면 false
	
	
	public Animal() {};
	public Animal(String species, int age, int weight, boolean eating) {
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.eating = eating;
	}
	
	
	
	
	
	
	
	
	
	
/////////////getter setter//////////////
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isEating() {
		return eating;
	}
	public void setEating(boolean eating) {
		this.eating = eating;
	}
	
	
/////////////////////////////////////////////////////	
}

////////////////////동물 클래스//////////////////////
class Cat extends Animal {
	public Cat(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
	//public void human("조련부","서강준"){}; 바디가 없어서 안되나??? 왜 안되지,,,,?? 디폴트로 이름이랑 출력 메소드 설정해줬는
}

class Tiger extends Animal {
	public Tiger(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
}

class Lion extends Animal {
	public Lion(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
}
class Cow extends Animal {
	public Cow(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
}

class Penguin extends Animal {
	public Penguin(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
	
}

class Eagle extends Animal {
	public Eagle(String species, int age, int weight, boolean eating) {
		super(species, age, weight, eating);
	}
	
	
}


