import java.util.*;
 
public class Fact
{
public static int fab(int a){

if(a==0){
return 1;
}
return a*fab(a-1);
}
    public static void main(String args[])
    {
       Scanner no = new Scanner(System.in);
       System.out.print("Enter the no. :");
       int a = no.nextInt();
       System.out.print("Factorial is "+fab(a));
    }
}