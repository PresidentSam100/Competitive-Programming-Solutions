import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 2
// Drake Equation
public class DrakeEquation {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner( new File("drake.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            double total = 100;
            for (int i = 0; i < 7; i++)
                total *= sc.nextDouble();
            if (total > 100)
                total = 100;
            System.out.printf("%.3f%%\n",total);
        }
    }
}
