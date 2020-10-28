// Solving buggy app problem in java using scanner class

import java.util.*;
class Solution
{
    int Sum_of_digit(int a)
    {
        int sum = 0;
        while(a!=0)
        {
            int d = a%10;
            sum = sum + d;
            a = a/10;
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();
        int hr = sc.nextInt();
        int min = sc.nextInt();
        int n = sc.nextInt();
        int flag = 0;
        
        while(true)
        {
            n = ob.Sum_of_digit(n);
            min = min + 15;
            if(min>60)
            {
                    min= min-60;
                    hr++;
            }
            
            if(hr>23)
            {
                System.out.println("ERROR");
                break;
            }
            if(n<10)
            {
                if(hr>9)
                    System.out.print(hr);
                else
                    System.out.print("0"+hr);
                if(min>9)
                System.out.print(" " + min);
                else
                System.out.print(" 0"+ min);
                
            break;
            }
        }           
        
    }
}
