import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		Accounts a1=new Accounts(/*Initial Balance =*/2000.0000);
		System.out.println("******Testing the member function one by one for the Class \"Accounts\"******");	
		System.out.println("The Initial Balance in the Account is =  Rs. "+a1.getBalance());
		// Testing the deposit and withdraw function inside the Accounts:
				//DEPOSIT METHOD
		System.out.print("Enter the Amount to Deposit:");
		double amountin=in.nextDouble();
		a1.deposit(amountin);
		System.out.println("\nNEW BALANCE:   Rs. "+a1.getBalance());
				//WITHDRAW METHOD
		System.out.print("Enter any Amount to withdraw (should not be exceed the current Balance ):  ");
		double amountout=in.nextDouble();
		a1.withdraw(amountout);
		System.out.println("\nNEW BALANCE:   Rs. "+ a1.getBalance());
		

		
		//Now Testing the Class SavingAccount member functions
		SavingAccounts a2=new SavingAccounts(/*Initial Value =*/a1.getBalance(), /*InterestPercentage=*/6);
					//Testing the calculateInterest Method
		System.out.println("***************Testing the SavingAccount Class :*****************");
		System.out.println("Your Saving Account has been created");
		System.out.println("Your Current Account Balance =  Rs."+a2.getBalance());
		System.out.print("Interest Percentage: "+ a2.getInterestRate());
		double intereste=a2.calculateInterest();
		//created above variable "intereste" so that values of interest calculated should not override
		//every time i call it
		System.out.println("\nInterest Earned =  Rs."+ intereste);
		
		System.out.println("Adding the Interest to the Total current Balance:");
		a2.deposit(intereste);				//interest is going to be added
		System.out.println("New Balance =   Rs."+a2.getBalance());
		//Now Testing the Class CheckingAccount
		
		CheckingAccount a3 = new CheckingAccount(/*initial balance*/a2.getBalance(), /*Fees/Transaction=Rs. */15.000);
		System.out.println("***************Checking your Account****************");
		System.out.println("Your Account Total Balance = "+a3.getBalance());
		System.out.println("Fees Per Transaction  = "+a3.getTransactionFees());
		System.out.print("\nEnter Amount to Deposit =  ");
		amountin=in.nextDouble();
		System.out.println("NEW BALANCE = Rs. "+a3.deposit(amountin));
		System.out.println("\nEnter the Amount to withdraw= ");
		amountout=in.nextDouble();
		System.out.println("NEW BALANCE= Rs. "+a3.withdraw(amountout));
		in.close();
	}	
}	
