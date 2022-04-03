import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 25
// Exponential Spiders
public class ExponentialSpiders {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("spiders.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N;x++)
        {
            sc.nextLine();
            int total = sc.nextInt();
            int start = sc.nextInt();
            int rate = start;
            int hours = 1;
            while (start < total)
            {
                start *= rate;
                hours++;
            }
            if (total < rate)
                System.out.println("About 0 hour(s) ago");
            else if (total == start)
                System.out.println("About " + hours + " hour(s) ago");
            else
                System.out.println("Between " + (hours - 1) + " and " + hours + " hour(s) ago");
        }
    }
}
