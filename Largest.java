import java.util.*;
import java.io.*;

public class Largest
{
   public static void main(String args[])
   {
       Scanner no = new Scanner(System.in);
       System.out.print("Enter the first no. :");
       int a = no.nextInt();
       System.out.print("Enter the second no. :");
       int b = no.nextInt();
      
       if(a>b)
       {
          System.out.print("A is larger");
       }
       else
       {
          System.out.print("B is larger");
       }
   }
}
