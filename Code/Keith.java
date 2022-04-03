import java.io.File;
import java.util.Scanner;
/*
Keith
Question 7
UIL Invitational A 2020
*/
public class Keith {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("keith.dat"));
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        while (sc.hasNextDouble())
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.printf("%.2f\n",a/b);
            min = Math.min(min,a/b);
            max = Math.max(max,a/b);
        }
        System.out.printf("Min = %.2f\n",min);
        System.out.printf("Max = %.2f\n",max);
    }
}
