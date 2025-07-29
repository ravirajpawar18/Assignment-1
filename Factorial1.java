import java.util.*;
import java.io.*;

public class Factorial1
{
int total=2;
 int Fact(int num)
{
 if(num>=1)
{
   total=num*Fact(num-1);
}
return total;
}

 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
int n=sc.nextInt();
Factorial1 f=new Factorial1();
System.out.println("Factorial is :"+f.Fact(n));
}
}
