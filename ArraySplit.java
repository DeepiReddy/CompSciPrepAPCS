//1. This program creates an array with 10 names
//2. Splits the first names into one array and the last names into another
//3. Puts the arrays together formatted "firstName lastName"
public class ArraySplit
{

   public static void main(String[] args)
   { 
   
    String people[] = { "Hazel Vineet",
                        "Amoolya Thummala",
                        "Deepika Reddy",
                        "Nishita Cheekatamarla",
                        "Krithik Nadella",
                        "Ishani Jembu",
                        "Sujit Kalva",
                        "Anika Joshi",
                        "Julia Vu",
                        "Priuyankaa Balaji"
                      };
    String firstName[] = new String [10];
    String lastName[] = new String [10];
    for(int i = 0; i < people.length; i++)
    {
     if(people[i].indexOf(" ") > 0)
     {
     firstName[i] = people[i].substring(0, people[i].indexOf(" "));
     lastName[i] = people[i].substring(people[i].indexOf(" ")+1);
     }
   // System.out.println(firstName[i]);
   // System.out.println(lastName[i]);
    }
    
      
    String allNames[] = new String [10];
    for(int i = 0; i < people.length; i++)
    {
     allNames[i] = firstName[i] + " " + lastName[i];
     System.out.println(allNames[i]);
    }
    
   }
}
