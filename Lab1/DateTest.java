package L1T3;
import java.util.Scanner;
public class DateTest {
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Welcome to Bhutto Clock:   ");
		System.out.println("Enter the month:");
		int x=in.nextInt();
		System.out.println("Enter the day:");
		int y = in.nextInt();
		System.out.println("Enter the year:");
		int z=in.nextInt();
		
		Date thedate=new Date(0, 0, 0);	
		/*null arguments so that in the next steps,the program may demonstrate 
		//the other functionalities of the program*/
		thedate.setmonth(x);
		thedate.setday(y);
		thedate.setyear(z);
		//to display the date we used displayDate () method
		thedate.displayDate(thedate.getday(), thedate.getmonth(), thedate.getyear());
	}
}
