package co.edureka.spring.core.beans;

public class Car {
	private String model;
	private Float cost;
	
	public Car(String model, Float cost) {
		super();
		this.model = model;
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public Float getCost() {
		return cost;
	}
}
