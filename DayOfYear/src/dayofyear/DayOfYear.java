package dayofyear;

import java.util.Calendar;
import java.util.Date;

public class DayOfYear {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        
        Date date = calendar.getTime();
        System.out.println(date);
        
        System.out.println("Today is day " + day + " of the year");
        
    }
    
}
