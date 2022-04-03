import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 20
// Dante's Peak
public class DantesPeak {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("peaks.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            sc.nextLine();
            int numbers = sc.nextInt();
            sc.nextLine();
            int [] data = new int [numbers];
            int max = 0;
            for (int i = 0; i < numbers; i++)
                data[i] = sc.nextInt();
            for (int i = 1; i < data.length; i++)
            {
                int temp = data[i] - data[i-1];
                if (temp > max)
                    max = temp;
            }
            System.out.println(max);
        }
    }
}
