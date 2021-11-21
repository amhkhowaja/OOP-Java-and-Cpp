
public class Accounts {
	private double Balance;
	public Accounts(double bal) {
		if (bal>=0) {
			Balance =bal;
			
		}
		else {
			Balance =0.0;
			//throw new IllegalArgumentException("Initial Balance is Invalid");	
			System.out.println("Initial Balance is Invalid");
		}
	}
	public double deposit(double Ammount) {
		if (Ammount<0) {
			System.out.println("Deposit Amount can not be in negative value");
		}
		else{
			Balance += Ammount;
		}
		return Balance;
	}
	public double withdraw(double Ammount) {
		
		if (Ammount > Balance ) {
			//throw new IllegalArgumentException("Transaction Ammount Exceeds the current Balance");
			System.out.println("Transaction Amount Exceeds the Current Balance");
		}
		else {
			
			Balance -=Ammount;			
		}
		return Balance;
	}
	//Additional Method setBalance to set the value of BALANCE 
	public void setBalance (double balance) {
		if (balance >0) {
			Balance =balance;
		}
		else {
			//throw new IllegalArgumentException("Balance can not be in the negative value");
			System.out.println("Balance Can not be in the negative value");
		}
	}
	
	public double getBalance () {
		return Balance ;
	}
}
