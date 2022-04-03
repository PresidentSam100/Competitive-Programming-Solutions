import java.io.File;
import java.util.Scanner;
// 2010 A+ Computer Science Sample Packet
// Question 3
// Submissions
public class Submit {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("submit.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            String s = sc.nextLine().toLowerCase();
            if (s.startsWith("today") && s.endsWith("mlia"))
            {
                System.out.println("VALID ENTRY");
            }
            else
                System.out.println("INVALID FORMATTING, TRY ANOTHER SUBMISSION");
        }
    }
}
