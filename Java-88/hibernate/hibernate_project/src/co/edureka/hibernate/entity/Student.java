package co.edureka.hibernate.entity;

public class Student {
	private Integer studentId;
	private String studentName;
	private String studentEmail;
	private String studentMobile;

	public Student() {		
	}

	public Student(String studentName, String studentEmail, String studentMobile) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
	}

	public Student(Integer studentId, String studentName, String studentEmail, String studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	@Override
	public String toString() {
		String student = String.format("%3d | %-14s |%-20s |%-10s", studentId, studentName, studentEmail,
				studentMobile);
		return student;
	}

}
