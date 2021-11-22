public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int day, month, year;
    private Date birthDate=new Date(day,getBirthMonth(),year);
    
    public Employee(String first, String last, String ssn, int d, int m, int y)
    {
       setFirstName(first);
       setLastName(last);
       setSocialSecurityNumber(ssn);
       day=d;
       setBirthMonth(m);
       year =y;
       
    }

    public void setFirstName(String f)
    {
        firstName = f;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String l)
    {
        lastName = l;

    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSocialSecurityNumber(String s)
    {
        socialSecurityNumber = s;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public void setBirthMonth(int m) {
    	month=m;
    }
    public int getBirthMonth() {
    	return month;
    }
    
    public int getCalenderMonth() {
    	return birthDate.getCurrentMonth();
    }
    public String toString()
    {
        return String.format("%s %s\n%s: %s", getFirstName(), getLastName(), "" +
                "Social-Security Number", getSocialSecurityNumber());
    }
    
    public abstract double earnings();

}