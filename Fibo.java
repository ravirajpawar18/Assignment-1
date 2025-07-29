import java.util.*;

public class Fibo
{
public void fibo(int n)
{
int a=0,b=1,c;
if(n<=0)
{
System.out.println("Enter a valid no.");
}
else if(n==1)
{
System.out.println(a);
}
else
{
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a no.  of terms :");
int n=s.nextInt();

Fibo obj = new Fibo();
obj.fibo(n);
}
}