//Exercise 2 in Chapter 29

import java.util.Scanner;  
public class CharAt  
{  
   public static void main(String args[])  
   {          
      Scanner in = new Scanner(System.in);  
      System.out.println("Enter a word");  
      String word = in.nextLine();  
        
      for(int i = 0; i < word.length(); i++)  
      {  
         System.out.println(word.charAt(i));  
      }  
   }  
} 