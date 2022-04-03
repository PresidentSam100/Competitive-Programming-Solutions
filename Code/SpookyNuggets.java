import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 18
// Spooky Nuggets
public class SpookyNuggets {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("nuggets.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a * b;
            int max = 1;
            for (int i = 1; i < c; i++)
            {
                boolean possible = false;
                int j = i;
                while (j > 0)
                {
                    if (j % b == 0)
                    {
                        possible = true;
                        break;
                    }
                    j -= a;
                }
                j = i;
                while (j > 0)
                {
                    if (j % a == 0)
                    {
                        possible = true;
                        break;
                    }
                    j -= b;
                }
                if (!possible)
                    max = i;
            }
            System.out.println(max);
        }
    }
}
