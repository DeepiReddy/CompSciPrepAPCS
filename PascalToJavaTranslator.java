//Exercise 1 in Chapter 29B

import java.util.Scanner;  
import java.io.*;
public class PascalToJavaTranslator 
{  
   public static void main(String[] args)throws Exception
   {  
      Scanner in = new Scanner(new File("pascal.txt"));  
      while (in.hasNextLine()) 
      {  
         String line = in.nextLine();  
         line = line.replaceAll(":=", "=");
         System.out.println(line); 
      }  
   }  
} 