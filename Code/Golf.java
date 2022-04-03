import java.io.File;
import java.util.Scanner;
// UIL Regional 2004
// Question 5
// Dice Golf
public class Golf {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("golf.dat"));
        int [] values = {0,0,9,-2,3,3,1,-3,1,-2,-2,1,1};
        while (sc.hasNextLine())
        {
            int N = sc.nextInt();
            int win = 0;
            sc.nextLine();
            int p1 = 1;
            int p2 = 1;
            for (int x = 0; x < N; x++)
            {
                int roll = values[sc.nextInt()];
                if (x % 2 == 0)
                    p1 += roll;
                else
                    p2 += roll;
                if (p1 < 1)
                    p1 = 1;
                if (p2 < 1)
                    p2 = 1;
                if (p1 >= 10)
                {
                    win = 1;
                    break;
                }
                if (p2 >= 10)
                {
                    win = 2;
                    break;
                }
            }
            System.out.println("Player " + win + " wins!");
            sc.nextLine();
        }
    }
}
