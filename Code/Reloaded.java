import java.io.File;
import java.util.Scanner;

public class Reloaded {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("reloaded.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x ++)
        {
            int size = sc.nextInt();
            sc.nextLine();
            int sum = (size * size / (size - 1)) * size;
        }
    }
}
