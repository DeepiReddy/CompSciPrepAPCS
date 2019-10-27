//Exercise 2 in Chapter 29B

import java.io.*;  
import java.util.*;  
public class LintFilter {  
   public static void main(String[] args)throws Exception
   {  
      Scanner in = new Scanner(new File("lint.txt"));  
      while (in.hasNextLine()) 
      {   
         String line = in.nextLine();  
         if (line.trim().startsWith("if") || line.trim().startsWith("while"))
         {  
            if (line.indexOf("=")> 0) 
            {  
               if (checkSingleEquals(line))  
                  System.out.println(line);  
            }  
          }  
       }  
   }  
     
   public static boolean checkSingleEquals(String line) {  
      int equalSign = line.indexOf("=");  
      String signs = "!<>";  
      if (line.charAt(equalSign-1)==' ' && line.charAt(equalSign+1)==' ') 
      { 
         return true; 
      } 
      else if (line.charAt(equalSign+1)=='=')  
      {
         return false;  
      }
      String beforeEquals = "" + line.charAt(equalSign-1);   
      if (signs.contains(beforeEquals))
      {  
         return false; 
      }
      else
      {                         
      return true; 
      } 
   }  
}  
  