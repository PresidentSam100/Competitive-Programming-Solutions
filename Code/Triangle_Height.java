import java.io.File;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 11
// Triangle Height
public class Triangle_Height {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("triangle_height.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String [] s = sc.nextLine().split(",");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double h = (2 * a) / b;
            System.out.printf("The height of the triangle is %.2f units\n", h);
        }
    }
}
