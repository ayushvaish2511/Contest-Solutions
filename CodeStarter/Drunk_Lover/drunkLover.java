import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q!=0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long t = sc.nextLong();
            long sum = 0;
            if(t%2==0)
            {
                sum = (t/2)*(a-b);
            }
            else
            {
                sum = (t/2)*(a-b);
                sum = sum + a;
            }
            System.out.println(sum);
            q--;
        }
    }
}
