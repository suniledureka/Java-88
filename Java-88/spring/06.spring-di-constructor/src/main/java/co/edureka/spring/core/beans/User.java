package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;
	private Car car;
	
	public User(String firstName, String lastName, Car car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.car = car;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Car getCar() {
		return car;
	}

}
