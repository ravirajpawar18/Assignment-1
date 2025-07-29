import java.util.*;

public class Swap
{
void swap(int a , int b)
{
System.out.println("Before swap a="+a);
System.out.println("Before swap b="+b);
int temp=a;
a=b;
b=temp;

System.out.println("After swap a="+a);
System.out.println("After swap b="+b);

}

public static void main(String args[])
{
int num1 , num2;
Scanner s = new Scanner(System.in);
System.out.println("Enter a first no.");
num1 = s.nextInt();

System.out.println("Enter a second no. :");
num2 = s.nextInt();

Swap obj = new Swap();
obj.swap(num1 , num2);
}
}