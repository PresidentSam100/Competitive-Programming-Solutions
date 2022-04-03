import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 14
// Babylonian Root
public class BabylonianRoot {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("root.dat"));
        int W = sc.nextInt();
        for (int x = 0; x < W; x++)
        {
            double X = sc.nextDouble();
            double R = sc.nextDouble();
            double N = sc.nextDouble();
            for (int i = 0; i < N; i++)
                R = (R + (X / R)) / 2;
            System.out.printf("%.8f\n", R);
        }
    }
}
