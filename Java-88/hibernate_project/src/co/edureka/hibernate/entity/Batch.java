package co.edureka.hibernate.entity;

public class Batch {
	private Integer batchId;
	private String course;
	private Faculty faculty;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(Integer batchId, String course, Faculty faculty) {
		super();
		this.batchId = batchId;
		this.course = course;
		this.faculty = faculty;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
}
