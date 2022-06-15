
public class Car {
	private String model;
	public Car(String model) {
		this.model=model;
	}
	
	@Override
	public boolean equals(Object obj) {//override
		if(obj instanceof Car) {//참조변수가 가르키고 있는 대상이 Car객체인가?
			Car otherCar = (Car)obj;
			return model.equals(otherCar.model);
		}else
			return false;
	}
	
	

}
