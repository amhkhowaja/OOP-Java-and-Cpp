public class PayRollTest {
    public static void main(String[] args) {
    	//Task 1 and Task2 is shown demonstrated here:
    	Employee emptype []=new Employee[5];
    	emptype[0]=new BasePlusCommissionEmployee("Mustafa", "Ali", "123456", 450, 0.9, 8, 2,2000, 80.00);
    	emptype[1]=new CommissionEmployee("Javed", "Akbar", "1258465", 140, 1.2, 2, 3, 2001);
    	emptype[2]=new HourlyEmployee("Aadarsh Mehdi", "Hyderi", "85551512", 50, 40, 2, 9, 2000);
    	emptype[3]=new SalariedEmployee("Kashif ", "Hyderi", "14782205520", 500, 19, 2,1999);
    	emptype[4]=new PieceWorker("Missem ", "Raza", "1475224494", 120.00, 7, 2, 8, 2006);			//Task 2 implementation
    	for (int i =0; i<5; i++) {
    		System.out.printf("%s\n%s: $%, .2f", emptype[i], "Earned", emptype[i].earnings());
            System.out.println();
    	}
    	
    	
    }
}