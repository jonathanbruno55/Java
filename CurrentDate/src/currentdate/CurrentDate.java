package currentdate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {
        
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("E MM-dd-yyyy hh:mm:ss aa");
        
        System.out.println(df.format(date));
    }
    
}
