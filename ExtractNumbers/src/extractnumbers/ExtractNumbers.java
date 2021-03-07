package extractnumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {
    public static void main(String[] args) {
        String str = "This string has numbers 33 and 55 in it.";
        System.out.println(str);
        
        // find 1 or more numbers
        Pattern p = Pattern.compile("[0-9]{1,}");
        Matcher m = p.matcher(str);
        
        while (m.find()){
            String found = str.substring(m.start(), m.end());
            Integer i = Integer.valueOf(found);
            System.out.println("Found: " + i);
        }
    }
    
}
