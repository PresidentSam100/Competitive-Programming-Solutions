import java.math.BigInteger;
import java.util.Scanner;

public class Maths {

    public static BigInteger factorial(BigInteger x)
    {
        if (x.longValue()<0) return new BigInteger("0");
        if (x.longValue()==1) return new BigInteger("1");
        return x.multiply(factorial(BigInteger.valueOf(x.longValue()-1)));
    }

    public static long gcd(long a, long b)
    {
        if (b==0) return a;
        return gcd(b, a%b);
    }

    public static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }

    public static long modpow(long x, long n, long m)
    {
        if (n==0) return 1%m;
        long u = modpow(x,n/2,m);
        u = (u*u)%m;
        if (n%2==1) u = (u*x)%m;
        return u;
    }

    public static BigInteger nthFibonacciNumber(long n)
    {
        return new BigInteger(String.valueOf(1 + Math.sqrt(5))).pow((int)n).min(new BigInteger(String.valueOf(1 - Math.sqrt(5))).pow((int)n)).divide(new BigInteger(String.valueOf(Math.pow(2,n) + Math.sqrt(5))));
    }

    public static boolean prime(long n)
    {
        if (n < 2) return false;
        for (int x = 2; x*x <= n; x++)
            if (n%x==0) return false;
        return true;
    }

    public static long sumOfDigits(BigInteger n)
    {
        long sum = 0;
        String x = n.toString();
        for (int i = 0; i < x.length(); i++)
            sum+=Integer.parseInt(x.substring(i,i+1));
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++)
        {
            long a = sc.nextLong();
            System.out.println(nthFibonacciNumber(a));
        }
    }
}
