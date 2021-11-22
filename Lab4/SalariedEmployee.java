public class SalariedEmployee extends Employee {

    private double weeklySalary;
    public SalariedEmployee(String first, String last, String ssn, double week, int d, int m, int y) {
        super(first, last, ssn, d, m , y);
        setWeeklySalary(week);
    }
    public void setWeeklySalary(double week)
    {
        if(week > 0.0)
        {
            weeklySalary = week;
        }
        else
            throw new IllegalArgumentException("Weekly Salary must be greater than 0.0");

    }
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s\n%s: $%,.2f",
                "Salaried Employee", super.toString(), "Weekly Salary", getWeeklySalary());
    }


    @Override
    public double earnings() {
    	if (getCalenderMonth()==getBirthMonth()) {
    		return (getWeeklySalary()+100.00);
    	}
    	else {
    		return getWeeklySalary();
    	}
    }
}