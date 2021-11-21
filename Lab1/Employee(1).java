package test;

public class Employee {
	private String fname;
	private String lname;
	private double MonthlySalary;
	
	Employee(String x, String y, double z){
		fname=x;
		lname=y;
		MonthlySalary=z;
		
	}
	public void setfname(String x){
		fname =x;
		
	}
	public String getfname(){
		return fname;
	}
	public void setlname(String y){
		lname =y;
		
	}
	public String getlname(){
		return lname;
	}
	public void setMonthlySalary(double z){
		if (z>0){
			MonthlySalary=z;
		}
	}
	public double getMonthlySalary(){
		return MonthlySalary;
	}
	public double getYearlySalary(){
		return MonthlySalary*12;
	}
	public double getIncrementSalary(){
		return getYearlySalary()+getYearlySalary()*0.1;
	}
}