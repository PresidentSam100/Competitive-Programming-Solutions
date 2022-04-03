import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 6
// aSALTed
public class Asalted {
    private static String[][] maze;
    private static boolean[][] visited;
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("asalted.dat"));
        int N = sc.nextInt();
        for (int x =0;x < N; x++)
        {
            sc.nextLine();
            maze = new String[10][10];
            visited = new boolean[10][10];
            for (int r = 0; r < maze.length;r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < maze[r].length; c++)
                {
                    maze[r][c] = s.substring(c, c+1);
                    visited[r][c] = false;
                }
            }
            boolean valid = valid(0,0);
            if (valid)
                System.out.println("Get to tha Choppa");
            else
                System.out.println("You've been aSALTed");
        }
    }

    public static boolean valid(int r, int c)
    {
        if (r <0 || r > maze.length-1 || c < 0 || c > maze[0].length-1)
            return false;
        else if (visited[r][c] || maze[r][c].equals("#"))
            return false;
        if (maze[r][c].equals("."))
            visited[r][c] = true;
        if (maze[r][c].equals("K"))
            return true;
        return valid(r-1,c) || valid(r+1,c) || valid(r,c-1) || valid(r,c+1);
    }
}
