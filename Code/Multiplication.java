import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 9
// Multiplication
public class Multiplication {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("multiplication.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = b;
            while (temp != 0)
            {
                System.out.print(a * (temp % 10) + " ");
                temp /= 10;
            }
            System.out.println(a * b);
        }
    }
}
