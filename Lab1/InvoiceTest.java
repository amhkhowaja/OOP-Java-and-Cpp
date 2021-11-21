package L1T2;
import java.util.Scanner;
public class InvoiceTest {
	public static void main(String args[]){
		System.out.println("Welcome To Bhutto Hardware Center");
		System.out.println("Enter Hardware Number: ");
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		System.out.println("Enter the Hardware Description: ");
		String b=input.nextLine();
		System.out.println("Enter the Purchase Items: ");
		int c=input.nextInt();
		System.out.println("Enter the Price Per item : ");
		double d=input.nextDouble();
		Invoice fee=new Invoice ("null", "null", 0,0.0); 
		//Initialization of the fee with null arguments, we can also directly intialize a, b, c, d values
		fee.setHnumber(a);
		fee.setHDescription(b);
		fee.setppi(d);
		fee.setpurchaseitem(c);
		System.out.print("Your Hardware number having model"+ fee.getHnumber());
		System.out.print(", having Description "+ fee.getHDescription()+"\n");
		System.out.print("You have ordered "+ fee.getpurchaseitem());
		System.out.print(" quantity of the stock , having unit price "+ fee.getppi());
		System.out.println("\n\nYour Total bill is "+ fee.getInvoiceAmount());
	}
}
