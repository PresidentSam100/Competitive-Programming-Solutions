import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 6
// Degree of Sorts
public class Degree {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("degree.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String [] s = sc.nextLine().split(" ");
            int total = 0;
            for (int i = 0; i < s.length - 1; i++)
            {
                String check = s[i];
                for (int j = i + 1; j < s.length; j++)
                {
                    if (check.compareTo(s[j]) > 0)
                        total++;
                }
            }
            System.out.println(total);
        }
    }
}
