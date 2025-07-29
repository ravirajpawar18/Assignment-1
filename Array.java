import java.util.*;
import java,io.*;

public class Array
{
   public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a size of array :");
       int size=sc.nextInt();
       int a[size];
       for(int i=0;i<size;i++)
         {
            int a[i]=sc.nextInt();
         }
      for(int i=0;i<size;i++)
         {
            System.out.print(a[i]);
         }
    }
}