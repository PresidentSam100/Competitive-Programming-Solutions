import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 15
// Bolt
public class Bolt {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("bolt.dat"));
        int N = sc.nextInt();
        for (int x = 0; x <N; x++)
        {
            int M = sc.nextInt();
            boolean right = true;
            int spaces = 0;
            for (int y = 0; y < M; y++)
            {
                if (right)
                {
                    for (int h = M; h >y; h--)
                    {
                        for (int i = 0; i < spaces; i++)
                            System.out.print(" ");
                        System.out.println("\\");
                        spaces++;
                    }
                }
                else
                {
                    for (int h = M; h >y; h--)
                    {
                        spaces--;
                        for (int i = 0; i < spaces; i++)
                            System.out.print(" ");
                        System.out.println("/");
                    }
                }
                right = !right;
            }
            System.out.println();
        }
    }
}
