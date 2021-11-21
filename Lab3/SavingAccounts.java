
public class SavingAccounts extends Accounts{
	private double InterestRate;
	public SavingAccounts(double balance, double interestrate) {
		super(balance);
		InterestRate=interestrate;
		
	}
	public void setInterestRate(double interestrate) {
		InterestRate = interestrate;	
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public double calculateInterest() {
		return (getInterestRate()*super.getBalance()/100);
	}
	
	
	
}
