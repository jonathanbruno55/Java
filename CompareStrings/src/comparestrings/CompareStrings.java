/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparestrings;

/**
 *
 * @author Jonathan Bruno
 */
public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String str1 = "foo";
    String str2 = "foo";
    String str3 = "Foo";
    
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);
    

    // java String comparison with the equals method
    if ( str1.equals(str2) ){
      System.out.println("str1 and str2 are the same"); 
    }
 
    // java String comparison with the equalsIgnoreCase method
    if ( str1.equalsIgnoreCase(str3)) {
      System.out.println("str1 and str3 match ignooring case"); 
    }
 
 
    // java String comparison with the compareTo method
    if ( str1.compareTo(str2) == 0) {
      System.out.println("str1 and str2 are the same"); 
    }
 
    // java String comparison with the compareToIgnoreCase method
    if ( str1.compareToIgnoreCase(str3) == 0) {
      System.out.println("str1 and str3 match ignooring case");
    }
  }
}
