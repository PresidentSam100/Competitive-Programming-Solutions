import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 5
// Decreasing Digits
public class Decreasing {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("decreasing.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int X = sc.nextInt();
            int temp = X;
            boolean decreasing = false;
            while (temp % X != 0 || !decreasing)
            {
                temp++;
                String check = Integer.toString(temp);
                String digit = check.substring(0,1);
                decreasing = true;
                for (int i = 1; i < check.length(); i++)
                {
                    if (digit.compareTo(check.substring(i,i+1)) <= 0)
                    {
                        decreasing = false;
                        digit = check.substring(i,i+1);
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
