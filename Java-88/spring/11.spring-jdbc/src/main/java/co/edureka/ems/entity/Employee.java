package co.edureka.ems.entity;

public class Employee {
	private Integer employeeNo;
	private String employeeName;
	private Float employeeSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeNo, String employeeName, Float employeeSalary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public Integer getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
