package co.edureka.spring.core.beans;

import java.util.Map;

public class Hospital {
	private String hospitalName;
	private Map<String, String> deptHeads;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Map<String, String> getDeptHeads() {
		return deptHeads;
	}

	public void setDeptHeads(Map<String, String> deptHeads) {
		this.deptHeads = deptHeads;
	}
}
