package countwords;

import java.util.*;

public class CountWords {
public static void main(String[] args){
    
    System.out.print("Enter a string: ");
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    String[] words = str.split(" ");
    
    System.out.println("String: " + str);
    System.out.println("Total Words: " + words.length);
    
    sc.close();
  }
    
}
