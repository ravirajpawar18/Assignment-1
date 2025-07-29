import java.util.*;

class Solution {
    public int countDigit(int n) {
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }     
        return count;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }
}
public class Digit
{

public static void main(String args[])
{
     Solution obj = new Solution();
     System.out.print("No. of digits are : "+obj.countDigit(120));
}
}