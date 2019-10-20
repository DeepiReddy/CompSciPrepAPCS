//1. Prints "Enter a name" and gets user input
//2. Prints each letter in the name, name.length times
//Examples:
//Input: Ravi
//Output: RRRRaaaavvvviiii
//Input: Deepti
//Output: DDDDDDeeeeeeeeeeeeppppppttttttiiiiii
import java.util.Scanner;
public class MultipleLetters
{

   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a name");
      String name = in.nextLine();
      String altName = "";
      for(int i = 0; i < name.length(); i++)
      { 
       for(int n = 0; n < name.length(); n++)
       {
        altName += name.charAt(i);
       }
      }
      System.out.println(altName);
   }
}