import java.io.File;
import java.util.Scanner;
// UIL State 2005
// Question 10
// Let's Make a Meal
public class Meal {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("meal.dat"));
        String[] caffeine = {"soda","coffee"};
        String[] sugar = {"cake","candy"};
        String[] salt = {"chips","popcorn"};
        String[] fat = {"burger","pizza"};
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            int ca = 0, su = 0, sa = 0, fa = 0;
            int M = sc.nextInt();
            sc.nextLine();
            for (int y = 0; y < M; y++)
            {
                String food = sc.nextLine().toLowerCase();
                for (int i = 0; i < 2; i++)
                {
                    if (food.contains(caffeine[i]))
                        ca++;
                    if (food.contains(sugar[i]))
                        su++;
                    if (food.contains(salt[i]))
                        sa++;
                    if (food.contains(fat[i]))
                        fa++;
                }
            }
            if (ca > 0 && ca <=2 && su > 0 && su <= 2 && sa > 0 && sa <= 2 && fa > 0 && fa <= 2)
                System.out.println("Programmer Fuel");
            else
                System.out.println("What would your mom say?");
        }
    }
}
