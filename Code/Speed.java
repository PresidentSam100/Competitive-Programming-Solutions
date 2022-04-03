import java.io.File;
import java.util.Scanner;
// UIL Regional 2005
// Question 9
// Speeding Takes its Toll
public class Speed {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("speed.in"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            double miles = sc.nextDouble();
            double hours = sc.nextDouble();
            if (miles / hours > 55)
                System.out.println("SPEEDING TICKET");
            else
                System.out.println("NO SPEEDING TICKET");
        }
    }
}
