import java.util.*;
import java.io.*;

public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a first no. :");
        int n = sc.nextInt();
        
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}