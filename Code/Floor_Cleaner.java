import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 3
// Floor Cleaner
public class Floor_Cleaner {
    private static String[][] maze = new String[10][10];
    private static boolean[][] valid = new boolean[10][10];
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("floor_cleaner.dat"));
        int rowB = -1;
        int colB = -1;
        for (int r = 0; r < 10; r++)
        {
            String s = sc.nextLine();
            for (int c = 0; c < 10; c++)
            {
                valid[r][c] = true;
                maze[r][c] = s.substring(c,c+1);
                if ("WF".contains(s.substring(c,c+1)))
                    valid[r][c] = false;
                if (s.substring(c,c+1).equals("B"))
                {
                    rowB = r;
                    colB = c;
                }
            }
        }
        while (sc.hasNext())
        {
            String[] s = sc.nextLine().split("[(,)]");
            int col = Integer.parseInt(s[1]);
            int row = Integer.parseInt(s[2]);
            maze[row][col] = "Z";
        }
        vaccum(rowB, colB);
        valid[rowB][colB] = false;
        for (int r =0; r < valid.length; r++)
        {
            for (int c = 0; c < valid[r].length; c++)
            {
                if (valid[r][c])
                    System.out.println("(" + c + "," + r + ")");
            }
        }
    }

    public static void vaccum(int row, int col)
    {
        if (row < 0 || row > maze.length-1 || col < 0 || col > maze[row].length-1)
            return;
        if (!valid[row][col])
            return;
        if(maze[row][col].equals("-"))
            valid[row][col] = false;
        if ("MFZ".contains(maze[row][col]))
            return;
        vaccum(row -1, col);
        vaccum(row+1,col);
        vaccum(row, col+1);
        vaccum(row, col-1);
    }
}
