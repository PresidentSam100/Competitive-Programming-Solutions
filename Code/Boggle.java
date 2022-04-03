import java.io.File;
import java.util.Scanner;

public class Boggle {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("boggle.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[][] boggle = new String[4][4];
            int points = 0;
            for (int r = 0; r < boggle.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < boggle[r].length; c++)
                    boggle[r][c] = s.substring(c,c+1);
            }
            int M = sc.nextInt();
            sc.nextLine();
            for (int y = 0; y < M; y++)
            {
                String s = sc.nextLine();
                boolean check = false;
                for (int r = 0; r < boggle.length; r++)
                {
                    for (int c = 0; c < boggle[r].length; r++)
                    {
                        if (boggle[r][c].equals(s.substring(0,1)))
                        {
                            check = check(boggle,r,c,s,0);
                        }
                        if (check)
                            break;
                    }
                }
                if (check)
                {

                }
            }
            System.out.println("PUZZLE #" + (x+1) + ": " + points);
        }
    }

    public static boolean check(String[][] boggle, int r, int c,String s, int index)
    {
        return false;
    }
}
