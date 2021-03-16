package stringascii;

public class StringASCII {

    public static void main(String[] args) {
        
        String str = "abc ABC 123";
        
        for(int i = 0; i< str.length() ; i++){
            System.out.print(str.charAt(i));
            System.out.print(" : ");
            System.out.println((int)str.charAt(i));
        }
    }
    
}
