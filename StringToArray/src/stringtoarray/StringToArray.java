package stringtoarray;

public class StringToArray {

    public static void main(String[] args) {
        
        String str = "Hello World";
        char[] array;
        
        array = str.toCharArray();
        
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}
