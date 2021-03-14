package reversestring;

public class ReverseString {

    public static void main(String[] args) {
        
        String forward = "the cat in the hat";
        
        String reverse = new StringBuffer(forward).reverse().toString();
        
        System.out.println("Before: " + forward);
        System.out.println("After: " + reverse);
    }
}
