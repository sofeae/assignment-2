package assignment2;
import java.sql.*;
import java.util.Scanner;

public class StudentMain {
	
	public static void main (String[] args) throws SQLException {
		
		Scanner in = new Scanner (System.in);
		
		//initialize MVC classes
		StudentModel model= new StudentModel();
		StudentView view = new StudentView();
		StudentCtrl controller = new StudentCtrl(model, view);
		
		System.out.print("1. Create new data and save to database \n2. Retrieve student's data from database \n\nEnter a number to choose : ");
		int action = in.nextInt();
		
		if (action == 1) {
			
			//prompt data
			System.out.println("\nInsert student data");
			System.out.print("ID : ");
			int id = in.nextInt();
			
			System.out.print("Name : ");
			String name = in.next();
			
			System.out.print("Department: ");
			String dept = in.next();
			
			System.out.print("Math mark: ");
			int mathMarks = in.nextInt();
			
			System.out.print("Science mark: ");
			int scienceMarks= in.nextInt();
			
			//Send data to Controller class
			controller.saveData(id, name, dept, mathMarks, scienceMarks);
			
		}
		
			else if(action == 2) {
			
			//Get student id from user
			System.out.print("\nEnter student id: ");
			int studId = in.nextInt();
			
			try {
				//Send student id to Controller class
				controller.readData(studId);
				
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		
			else if (action < 1 || action > 2) {
				System.out.println("The number you entered is invalid.");
			}
	}
}
