import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 3
// Armstrong Numbers
public class Armstrong {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("armstrong.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int num = sc.nextInt();
            int check = num;
            int pow = 0;
            int total = 0;
            for (int i = 1; i < num; i *= 10)
                pow++;
            while (num != 0)
            {
                total += Math.pow(num % 10, pow);
                num /= 10;
            }
            if (check == total)
                System.out.println("ARMSTRONG");
            else
                System.out.println("NOT AN ARMSTRONG");
        }
    }
}
