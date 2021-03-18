package lowercase;

public class LowerCase {

    public static void main(String[] args) {
        String str = "ABCDEF GHIJKL MNOPQR STUVWXYZ";
        
        String low = str.toLowerCase();
        
        System.out.println("Original string: " + str);
        System.out.println("Lower case: " + low);
    }
    
}
