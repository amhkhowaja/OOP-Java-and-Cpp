package L1T3;

public class Date {
	private int month;
	private int day;
	private int year;
	Date (int d, int m, int y){
		month=m;
		year=y;
		day=d;
	}
	public void setday(int x){
		day=x;
	}
	public int getday(){
		return day;
	}
	public void setmonth(int y){
		month=y;
	}
	public int getmonth(){
		return month;
	}
	public void setyear(int z){
		year=z;
	}
	public int getyear(){
		return year;
	}
	public void displayDate(int x, int y, int z){
		System.out.println("The date is :\n\n");
		System.out.println(x+"/"+y+"/"+z);
	}
}
