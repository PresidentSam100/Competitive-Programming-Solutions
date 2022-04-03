import java.io.File;
import java.util.Scanner;
// 2010 A+ Computer Science Sample Packet
// Question 2
// Objection
public class Objection {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("objection.in"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            if (a <= 0)
                System.out.println("GUILTY!");
            else
            {
                for (int j = 0; j < a; j++)
                {
                    System.out.println("Objection!");
                }
                System.out.println("HOLD IT!");
            }
            System.out.println();
        }
    }
}
