package Lab01;
public class GradeBookTest {
	public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a  Course Name");
		//String CourseName = input.nextLine();
		
		GradeBook myGrade = new GradeBook("Java", "Sir Saad");
		myGrade.displayMessage();
		myGrade.setCourseName("DLD");
		myGrade.setCourseInstructor("Sir Alamgir Naushad");
		myGrade.displayMessage();
		
	}
}