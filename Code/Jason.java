import java.io.File;
import java.util.Scanner;
/*
Jason
Question 5
UIL Invitational A 2020
*/
public class Jason {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("jason.dat"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double x = -b / (2*a);
            double y = a * x * x + b * x + c;
            System.out.printf("(%.3f,%.3f)",x,y);
            if (a < 0)
                System.out.println("-->DOWNWARD");
            else if (a > 0)
                System.out.println("-->UPWARD");
        }
    }
}
