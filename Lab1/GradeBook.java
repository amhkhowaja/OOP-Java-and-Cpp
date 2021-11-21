package Lab01;

public class GradeBook {
	private String CourseName ;
	private String C_instructor;
	GradeBook(String C_Name, String I_Name)
	{
		CourseName = C_Name;
		C_instructor=I_Name;
	}
	public void setCourseName(String C_Name)
	{
		CourseName = C_Name;
	}
	public String getCourseName()
	{
		
		return CourseName;
	}
	public void setCourseInstructor(String x){
		C_instructor=x;
	}
	public String getCourseInstructor(){
		return C_instructor;
	}
	public void displayMessage()
	{
		
		 //CourseName = Name;
		System.out.println("Welcome to  "+getCourseName());
		System.out.println("This Course is presented by : "+ getCourseInstructor());
	
	}
}