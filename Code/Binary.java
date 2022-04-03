import java.io.File;
import java.util.Scanner;
// UIL District2 2012
// Question 1
// Binary Clock
public class Binary {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("binary.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[][] clock = new String[4][6];
            for (int r = 0; r < clock.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < clock[r].length; c++)
                    clock[r][c] = s.substring(c,c+1);
            }
            String time = "";
            for (int c = 0; c < clock[0].length; c++)
            {
                int temp = 0;
                for (int r = 0; r < clock.length; r++)
                {
                    if (clock[r][c].equals("*"))
                        temp += Math.pow(2,3-r);
                }
                time += Integer.toString(temp);
            }
            System.out.println(time.substring(0,2) + ":" + time.substring(2,4) + ":" + time.substring(4));
        }
    }
}
