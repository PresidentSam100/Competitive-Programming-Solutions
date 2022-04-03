import java.io.File;
import java.util.Scanner;
// 2010 A+ Computer Science Sample Packet
// Question 4
// A Prime Opportunity
public class Prime {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("prime.in"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int num = 2;
            while (num <= a)
            {
                if (isprime(num))
                {
                    while (a % num == 0)
                    {
                        System.out.print(num + " ");
                        a /= num;
                    }
                }
                num++;
            }
            System.out.println();
        }
    }
    public static boolean isprime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
