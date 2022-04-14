package assignment2;
import java.sql.*;

public class StudentCtrl {
	
	//declare variable
	private static StudentModel model = new StudentModel();
	private StudentView view;
	
	//constructor
	public StudentCtrl (StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	//read data from database
	public void readData(int id) throws SQLException {
		
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db1?" + "user=root&password=sofeaezzaty@25");
	
	//create statement from connection
	Statement stmt = conn.createStatement();
	
	//retrieve results from the table
	ResultSet rs = stmt.executeQuery("Select * from studentmark");
	
	//count columns
	ResultSetMetaData rsmd = rs.getMetaData();
	int i = rsmd.getColumnCount();
	
	//insert records to model class
	while (rs.next()) {
		for (int j=1; j<=i; j++) {
			if (Integer.valueOf(rs.getString(1)) == id) {
				if (j==1)
					model.setId(Integer.valueOf(rs.getString(j)));
				else if (j==2)
					model.setName(rs.getString( j));
				else if(j == 3)
					model.setDept(rs.getString( j));
				else if(j == 4)
					model.setMathMark(Integer.valueOf(rs.getString( j)));
				else if(j == 5)
					model.setScienceMark(Integer.valueOf(rs.getString( j)));
			}
		}
	}
	
	updateView();
	
	}
	
	//send data to view class
	public void updateView() {
		view.printStudentMarks (model.getId(), model.getName(), model.getDept(), model.getMathMark(), model.getScienceMark());
	}
	
	//save data to database
	public void saveData(int id, String name, String department, int mathMarks, int scienceMarks) throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db1?" + "user=root&password=sofeaezzaty@25");
	
		// create a Statement from the connection
				Statement statement = conn.createStatement();
				
				// insert the data into database
				statement.executeUpdate("INSERT INTO studentmark VALUES (" + id + ", '"+ name + "', '" +
				department + "', " + mathMarks + ", " + scienceMarks + ")");
	}
}
