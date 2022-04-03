import java.io.File;
import java.util.Scanner;
// UIL District2 2012
// Question 9
// Nautical Miles
public class Nautical {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("nautical.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            double d = sc.nextDouble();
            d *= 1.15;
            System.out.printf("%.1f\n",d);
        }
    }
}
