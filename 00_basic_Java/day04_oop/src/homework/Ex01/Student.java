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
		System.out.println("�̸�: " + super.getName() + " Ű: " + super.getH() + "cm" + " ������: " + super.getW() + "kg");
		System.out.println("�а�: " + getDepartment() + " �й�: " + getIdNumber() + " �г�: " + getGrade());
	}
}
