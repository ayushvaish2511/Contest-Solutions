import java.util.*;

class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i<N; i++)
            a[i] = sc.nextInt();
        int c = 0;
        for(int i = 0; i<N-1; i++)
        {
            for(int j = i+1; j<N; j++)
            {
                if((a[i]+a[j])==X)
                c++;
            }
        }
        System.out.println(c);
    }
}
