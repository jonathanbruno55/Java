package stringtonumber;

public class StringToNumber {

    public static void main(String[] args) {
        
        String str1 = "100";
        // int primitive
        int i1=Integer.parseInt(str1);
        // Integer Object
        Integer i2 = Integer.valueOf(str1);
        
        String str2 = "3.14";
        // float primitive
        float f1 = Float.parseFloat(str2);;
        // Float Object
        Float f2 = Float.valueOf(str2);
        
        String str3 = "123456789";
        // double primitive
        double d1 = Double.parseDouble(str3);
        // Double Object
        Double d2 =  Double.valueOf(str3);
                
    }
    
}
