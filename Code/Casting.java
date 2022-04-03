import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 4
// Casting Out Nines
public class Casting {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("casting.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String s = sc.nextLine();
            int total = 0;
            if (s.length() == 1)
                total = -1;
            int sum;
            do
            {
                sum = 0;
                for (int i = 0; i < s.length(); i++)
                    sum += Integer.parseInt(s.substring(i,i+1));
                s = Integer.toString(sum);
                total++;
            }
            while (sum >= 10);
            System.out.println(total);
        }
    }
}
