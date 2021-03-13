package findword;

public class FindWord {

    public static void main(String[] args) {
        
        String str1 = "The cat in the hat.";
        System.out.println(str1);
        
        // find this word
        String str2 = "cat";
        
        int index = str1.indexOf(str2);
        
        if(index >=0){
            System.out.println("The word " + str2 + " found");
            System.out.println("index " + index);
        } else{
            System.out.println(str2 + " not found");
        }
    }
    
}
