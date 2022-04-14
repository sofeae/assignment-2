package assignment2;

public class StudentView {

	public void printStudentMarks (int id, String name, String dept, int mathMark, int scienceMark) {
		System.out.println("\nStudent's Marks for Mathematics and Science : ");
		System.out.println("\nID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Department : " + dept);
		System.out.println("Mathematics Marks : " + mathMark);
		System.out.println("Science Marks : " + scienceMark);
	}	
}
