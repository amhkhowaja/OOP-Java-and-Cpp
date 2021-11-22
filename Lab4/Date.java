import java.util.Calendar; 
public class Date {
    private int month;
    private int day;
    private int year;
    private int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH); 
    private static final int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int theMonth, int theDay, int theYear)
    {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
    }
    public int checkMonth(int testMonth)
    {
        if(testMonth <= 0 && testMonth > 12)
        {
        	throw new IllegalArgumentException("Month value must be in range 0f 1 - 12");
        	
        }
        else
        {
        	return testMonth;
        }
    }
    public int checkDay(int testDay)
    {
        if(testDay <= 0 && testDay > daysPerMonth[month])
        {
        	throw new IllegalArgumentException("Day is not valid for this Month & Year");
        }

        if(month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            return testDay;
        }
        else {
        	return testDay;
        }    
    }
    public int getCurrentMonth() {
    	return currentMonth;
    }
    public String toString()
    {
        return String.format("%d/%d/%d ", month, day, year);
    }
    public int getMonth() {
    	return month;
    }
    
    
}