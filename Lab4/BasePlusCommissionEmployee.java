public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String first, String last, String ssn, 
    		double sales, double rate, int d, int m, int y, double bSalary) {
        super(first, last, ssn, sales, rate, d, m ,y);
        setBaseSalary(bSalary);
        
    }
    public void setBaseSalary(double salary)
    {
        if(salary > 0.0 )
        {
            baseSalary = salary;
        }
        else
            throw new IllegalArgumentException("Salary must be greater than 0.0");
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings() {
    	if (getCalenderMonth()==getBirthMonth()) {
    		return (getBaseSalary() + super.earnings()+100.00);
    	}
    	else {
    		return getBaseSalary() + super.earnings();
    	}
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f","Base Salaried", super.toString(), "Base Salary", getBaseSalary());
    }
}