import java.util.*;
public class Reverse {

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();
int rev =1;
while(num>0){
rev=rev*10+num%10;
num=num/10;
}


System.out.println("the reverse no is "+num);

}

}