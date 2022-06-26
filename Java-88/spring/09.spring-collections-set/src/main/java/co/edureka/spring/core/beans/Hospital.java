package co.edureka.spring.core.beans;

import java.util.Set;

public class Hospital {
	private String hospitalName;
	private Set<String> departments;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Set<String> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<String> departments) {
		this.departments = departments;
	}

}
