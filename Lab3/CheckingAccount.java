public class CheckingAccount extends Accounts {
	private double TransactionFees;
	public CheckingAccount(double balance, double fees ) {
		super(balance);
		TransactionFees=fees;
	}
	
	@Override 
	public double deposit(double Ammount) {
		if (Ammount <0) {
			System.out.println("The Deposit Amount can not be in the negative value");
		}
		else {
			setBalance((super.deposit(Ammount)-getTransactionFees()));	
		}
		return getBalance ();
		
	}
	
	public double withdraw (double Ammount) {
		boolean FlagForTransaction=false;
		if ((Ammount+getTransactionFees()) > getBalance() ) {
		//added the Amount Variable in the above condition because transaction require the fees as well 
			
			//throw new IllegalArgumentException("Transaction Amount Exceeds the current Balance");
			System.out.println("Transaction Amount Exceeds the Current Balance");
		}
		else {
			FlagForTransaction=true;		
		}
		if (FlagForTransaction==true) {
			setBalance (super.withdraw(Ammount)-getTransactionFees());
		}
		return getBalance();

	}
	public double getTransactionFees() {
		return TransactionFees;
	}

	
}
