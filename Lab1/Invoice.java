package L1T2;

public class Invoice {
	String Hnumber;
	String HDescription;
	int purchaseitem;
	double ppi;
	Invoice (String a, String b, int c, double d){
		Hnumber=a;
		HDescription=b;
		purchaseitem =c;
		ppi=d;
	}
	public void setHnumber(String x){
		Hnumber=x;
	}
	public String getHnumber(){
		return Hnumber;
		
	}
	public void setHDescription(String y){
		HDescription=y;
		
	}
	public String getHDescription(){
		return HDescription;
	}
	public void setpurchaseitem(int z){
		if (z<0){
			purchaseitem=0;
		}
		else{
			purchaseitem =z;
		}
		
	}
	public int getpurchaseitem (){
		return purchaseitem;
	}
	public void setppi(double g){
		if (g<0){
			ppi=0.0;
		}
		else{
			ppi=g;
		}
		
	}
	public double getppi(){
		return ppi;
	}
	public double getInvoiceAmount(){
		return ppi*purchaseitem;
	}
	public void InvoiceTest(){
		System.out.println("Welcome to the fee Invoice of the Bhutto Hardware Store");
		System.out.println("Hardware Model Number: "+ Hnumber);
		System.out.println("Hardware Description: " + HDescription);
		System.out.println("Purchase Items : " + purchaseitem);
		System.out.println("Price Per Item : "+ ppi);
		System.out.println("Total Amount of price : "+ getInvoiceAmount());
	}
}
