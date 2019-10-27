//Exercise 1 in Chapter 29

import java.util.Scanner;
public class NameEcho
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first and last name");
      String ogName = in.nextLine();
      String name = ogName.trim();
      
      if(name.indexOf(" ") > 0)
      {
         String firstName = name.substring(0, name.indexOf(" "));
         String lastName = name.substring(name.indexOf(" ")+1, name.length());
         String capsLastName = lastName.toUpperCase();
         
         System.out.println(firstName + " " + capsLastName);  
      }
      else
      {
         System.out.println("invalid first and last name");
      }
   }
}