import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 7
// Vector Addition
public class Vectors {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("vectors.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int w = 0; w < N; w++)
        {
            String [] s = sc.nextLine().split(" ");
            int x = 0;
            int y = 0;
            for (int i = 0; i < s.length; i++)
            {
                String [] ss = s[i].split(",");
                x += Integer.parseInt(ss[0].substring(1));
                y += Integer.parseInt(ss[1].substring(0, ss[1].length() - 1));
            }
            System.out.println("{" + x + "," + y + "}");
        }
    }
}
