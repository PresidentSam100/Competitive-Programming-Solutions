import java.io.File;
import java.util.Scanner;
// UIL State 2004
// Question 4
// Radiant Primes
public class Radiant {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("radiant.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int num = sc.nextInt();
            int base = sc.nextInt();
            String temp = Integer.toString(num,base);
            int rad = 0;
            int m = 1;
            for (int i = 0; i < temp.length(); i++)
            {
                rad += m * Integer.parseInt(temp.substring(i,i+1));
                m *= base;
            }
            int factors = 0;
            for (int i = 1; i <= rad; i++)
            {
                if (rad % i == 0)
                    factors++;
            }
            if (factors == 2)
                System.out.println("prime");
            else
                System.out.println("non-prime");
        }
    }
}
