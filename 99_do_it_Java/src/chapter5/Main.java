package chapter5;

public class Main {

	public static void main(String[] args) {

		Student studentCho = new Student(930602, "Youngshin Cho");
//		studentCho.studentID = 930602;
//		studentCho.studentName = "Youngshin Cho";
		studentCho.address = "Namyangju";
		
		studentCho.showStudentInfo();
		
		Student studentKim = new Student(960316, "Jiyun Kim");
//		studentKim.studentID = 960316;
//		studentKim.studentName = "Jiyun Kim";
		studentKim.address = "Incheon";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentCho);
		System.out.println(studentKim);

	}

}
