package assignment2;

public class StudentModel {
	
	//declare variables
	private int id, mathMark, scienceMark;
	private String name, dept;
	
	//get method	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getMathMark() {
		return mathMark;
	}
	
	public int getScienceMark() {
		return scienceMark;
	}
	
	//set method
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setMathMark(int mathMark) {
		this.mathMark = mathMark;
	}
	
	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}
}


