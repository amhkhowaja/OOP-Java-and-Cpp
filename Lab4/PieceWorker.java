
public class PieceWorker extends Employee{
	private double wage;
	private int pieces; 
	public PieceWorker(String first, String last, String ssn, double wageperprice, int piece, int d, int m, int y) {
		super(first, last, ssn, d, m, y);
		setWage(wageperprice);
		setPieces(pieces);
	}
	public void setWage(double wpp) {
		wage=wpp;
	}
	public double getWage() {
		return wage;
	}
	public void setPieces(int p) {
		pieces=p;
	}
	public int getPieces() {
		return pieces;
	}
	
	@Override
	public double earnings() {
		if(getCalenderMonth()==getBirthMonth()) {
			return (getPieces()*getWage()+100.00);
		}
		return getPieces()*getWage();
	}
}
