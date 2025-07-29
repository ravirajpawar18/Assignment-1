import java.util.*;
import java.io.*;

public class EvenorOdd
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n = sc.nextInt();
      int A[] = new int[n];
      int sumE=0,sumO=0;
      for(int i=0;i<n;i++)
      {
          A[i]=sc.nextInt(); 
      }
      for(int i=0;i<n;i++)
     {
         if(A[i] % 2 ==0)
           {
               sumE=A[i]+sumE;
           }
         else
           {
               sumO=A[i]+sumO;
           }
     }
     System.out.println("sum of even is : "+sumE);
     System.out.println("Sum of odd is :"+sumO);
   }
}