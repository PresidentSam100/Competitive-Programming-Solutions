import java.io.File;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("hard.dat"));
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long aa = 0;
            long bb = 0;
            for (int j = 0; j < n; j++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                aa += a;
                bb += b;
            }

            int res = 0;
            if (aa < bb)
            {
                res += (bb - aa) * y;
            }
            else if (bb < aa)
            {
                res += (aa - bb) * x;
            }
            System.out.println(res);
        }
    }
}
