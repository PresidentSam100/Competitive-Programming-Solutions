import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 10
// Rain Boots
public class RainBoots {
    private static String[][]ss;
    private static int[][] steps;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("rain_boots.dat"));
        while (sc.hasNextLine())
        {
            ss = new String[8][8];
            steps = new int[8][8];
            int sRow = -1;
            int sCol = -1;
            for (int r = 0; r < ss.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < ss[r].length; c++)
                {
                    ss[r][c] = s.substring(c, c+1);
                    if (ss[r][c].equals("S"))
                    {
                        sRow = r;
                        sCol = c;
                    }
                }
            }

            int mud = 0;
            while (mud < 64)
            {
                for (int[] step : steps)
                    Arrays.fill(step, 64);
                solvable(sRow, sCol, mud, 0);

                boolean work = false;
                for (int r = 0; r < ss.length; r++)
                {
                    for (int c = 0; c < ss[r].length; c++)
                    {
                        if (ss[r][c].equals("E") && steps[r][c] != 64) {
                            work = true;
                            break;
                        }
                    }
                }

                if (work) {
                    System.out.println(mud);
                    break;
                }
                mud++;
            }
            if (sc.hasNextLine())
                sc.nextLine();
        }
    }

    public static void solvable(int row, int col, int mud, int step)
    {
        if (row < 0 || row > ss.length - 1 || col < 0 || col > ss[0].length - 1)
            return;
        if (step > steps[row][col])
            return;
        if (ss[row][col].equals("M")&&mud<=0)
            return;
        if (ss[row][col].equals("M")&&mud>0)
            mud--;
        step++;
        steps[row][col] = step;
        solvable(row,col-1,mud,step);
        solvable(row,col+1,mud,step);
        solvable(row-1,col,mud,step);
        solvable(row+1,col,mud,step);
    }
}
