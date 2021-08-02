package homework.Ex01;

public class Student extends Person {
	private String department;
	private int idNumber, grade;
	
	public Student(String name, int h, int w, String department, int idNumber, int grade) {
		super(name, h, w);
		this.department = department;
		this.idNumber = idNumber;
		this.grade = grade;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("Student");
		System.out.println("이름: " + super.getName() + " 키: " + super.getH() + "cm" + " 몸무게: " + super.getW() + "kg");
		System.out.println("학과: " + getDepartment() + " 학번: " + getIdNumber() + " 학년: " + getGrade());
	}
}
