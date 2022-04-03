import java.io.File;
import java.util.Scanner;

public class PacMan {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("pacman.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            int size = sc.nextInt();
            int row = -1;
            int col = -1;
            sc.nextLine();
            String[][] maze = new String[size][size];
            boolean[][] beenThere = new boolean[size][size];
            for (int r = 0; r < maze.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < maze[r].length; c++)
                {
                    maze[r][c] = s.substring(c, c+1);
                    if (maze[r][c].equals("C"))
                    {
                        row = r;
                        col = c;
                    }
                    System.out.print(maze[r][c]);
                }
                System.out.println();
            }
            int moves = moves(row, col, maze, beenThere);
            if (moves == 0)
            {
                System.out.println("PacMan should retire.");
            }
            else
            {
                System.out.println("PacMan can escape in " + moves + " moves.");
            }
        }
    }

    public static int moves(int row, int col, String[][] maze, boolean[][] beenThere)
    {
        if (row < 0 || row > maze.length - 1 || col < 0 || col > maze[0].length - 1)
        {
            return 0;
        }
        return 1;
    }
}
