import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 8
// Landscape
public class Landscape {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("landscape.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[][]s = new String[10][15];
            for (int r = 0; r < s.length; r++)
            {
                String temp = sc.nextLine();
                for (int c = 0; c < s[r].length; c++)
                    s[r][c] = temp.substring(c,c+1);
            }
            for (int c = s[0].length-1; c >= 0; c--)
            {
                for (int r = 0; r < s.length; r++)
                    System.out.print(s[r][c]);
                System.out.println();
            }
            System.out.println();
        }

    }
}
