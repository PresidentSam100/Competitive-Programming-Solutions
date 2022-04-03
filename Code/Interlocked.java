import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 7
// Interlocked
public class Interlocked {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("interlocked.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            int indexA = 0;
            int indexB = 0;
            for (int i = 0; i < c.length(); i++)
            {
                char temp = c.charAt(i);
                if (indexA < a.length() && temp == a.charAt(indexA))
                    indexA++;
                if (indexB < b.length() && temp == b.charAt(indexB))
                    indexB++;
            }
            boolean d = indexA == a.length() && indexB == b.length();
            if (d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
