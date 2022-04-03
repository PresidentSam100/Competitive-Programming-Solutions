import java.io.File;
import java.util.Scanner;
// UIL State 2005
// Question 4
// Bullet Time
public class Bullet {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("bullet.in"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[] data = sc.nextLine().split("[(,)]");
            int firstDist = Integer.parseInt(data[5]) - Integer.parseInt(data[1]);
            int secondDist = Integer.parseInt(data[6]) - Integer.parseInt(data[2]);
            int thirdDist = Integer.parseInt(data[7]) - Integer.parseInt(data[3]);
            int[] values = new int[3];
            values[0] = Integer.parseInt(data[1]) + firstDist * 5;
            values[1] = Integer.parseInt(data[2]) + secondDist * 5;
            values[2] = Integer.parseInt(data[3]) + thirdDist * 5;
            System.out.println("(" + values[0] + "," + values[1] + "," + values[2] + ")");
        }
    }
}
