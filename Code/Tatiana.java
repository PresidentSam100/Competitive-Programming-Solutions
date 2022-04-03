import java.io.File;
import java.util.Scanner;
/*
Tatiana
Question 12
UIL Invitational A 2020
*/
public class Tatiana {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("tatiana.dat"));
        int n = sc.nextInt();
        String[] output = new String[n];
        double average = 0;
        double[] averages  = new double[n];
        for (int i = 1; i <= n; i++)
        {
            int a = sc.nextInt();
            double total = 0;
            for (int j = 0; j < a; j++)
            {
                double d = sc.nextDouble();
                total += d;
            }
            average += total;
            averages[i-1] = total;
            output[i-1] = String.format("%02d   %.2f   ",i,total);
        }
        average /= n;
        for (int i = 0; i < n; i++) {
            System.out.print(output[i]);
            System.out.printf("%+.2f\n",averages[i] - average);
        }
    }
}
