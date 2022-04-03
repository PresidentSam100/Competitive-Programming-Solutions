import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL Regional 2004
// Question 3
// List the Primes
public class Primes {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("primes.dat"));
        while (sc.hasNextLine())
        {
            String [] s = sc.nextLine().split(" ");
            ArrayList<Integer> primes = new ArrayList<>();
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            for (int i = a; i <= b; i++)
            {
                boolean prime = true;
                for (int p = 2; p < i; p++)
                {
                    if (i % p == 0)
                        prime = false;
                }
                if (prime)
                    primes.add(i);
            }
            if (primes.isEmpty())
                System.out.println("No primes found!");
            else
            {
                for (int i =0; i < primes.size(); i++)
                    System.out.print(primes.get(i) + " ");
                System.out.println();
            }
        }
    }
}
