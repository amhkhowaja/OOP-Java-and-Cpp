package test;

import java.util.Scanner;



//import L1T1.Employee;

public class EmployeeTest {
	public static void main(String args[]){
		System.out.println("Hello");
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Employee#1 First Name:  ");
		String a=in.nextLine();
		System.out.println("Employee#1 Last Name :  ");
		String b=in.nextLine();
		System.out.println("Employee#1 Monthly Salary");
		double c=in.nextDouble();
		Scanner xx=new Scanner (System.in);
		System.out.println("Employee#2 First Name:  ");
		String a2=xx.nextLine();
		System.out.println("Employee#2 Last Name :  ");
		String b3=xx.nextLine();
		System.out.println("Employee#2 Monthly Salary");
		double c2=xx.nextDouble();
		Employee emp1=new Employee(a,b,c);
		Employee emp2=new Employee(a2, b3 ,c2);
		
		System.out.println("Employee 1 yearly Salary:   "+emp1.getYearlySalary());
		System.out.println("Employee 1 yearly Salary with Increment:   "+emp1.getIncrementSalary());
		System.out.println("Employee 2 Yearly Salary:   "+emp2.getYearlySalary());
		System.out.println("Employee 2 Yearly Salary with Increment:   "+emp2.getIncrementSalary());
		
	}
}