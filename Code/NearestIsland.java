import java.io.File;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 3
// Nearest Island
public class NearestIsland {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("nearestisland.in"));
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double cx = X;
        double cy = Y;
        double closest = -1;
        while (sc.hasNextDouble())
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double dist = Math.sqrt(Math.pow(x - X, 2) + Math.pow(y - Y, 2));
            if (closest > dist || closest == -1)
            {
                cx = x;
                cy = y;
                closest = dist;
            }
        }
        System.out.printf("[%.1f, %.1f]",cx, cy);
    }
}
