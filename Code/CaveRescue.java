import java.io.File;
import java.util.Scanner;
// Clements Invitational
// Question 11
// Cave Rescue
public class CaveRescue {
    static String[][] arr;
    static boolean[][] visited;
    static boolean canswim;
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("caverescue.dat"));
        while (sc.hasNext())
        {
            String[] str = sc.nextLine().split(",");
            canswim = Boolean.parseBoolean(str[0]);
            int cols = Integer.parseInt(str[1]);
            int rows = Integer.parseInt(str[2]);
            arr = new String[rows][cols];
            visited = new boolean[rows][cols];
            int startR = -1;
            int startC = -1;

            for (int r = 0; r < rows; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < cols; c++)
                {
                    arr[r][c] = s.substring(c,c+1);
                    if (s.substring(c,c+1).equals("T"))
                    {
                        startR = r;
                        startC = c;
                    }
                }
            }
            boolean a = traverse(startR,startC,0);
            if (a)
                System.out.println("Rescue");
            else
                System.out.println("Supply");
        }
    }

    public static boolean traverse(int row, int col, int flood)
    {
        if (row < 0 || col < 0 || row > arr.length-1 || col > arr[row].length - 1)
            return false;
        else if (visited[row][col] || arr[row][col].equals("W"))
            return false;
        else if (arr[row][col].equals("E"))
            return true;
        if (arr[row][col].equals("F"))
        {
            if (canswim)
                flood++;
            else
                return false;
            if (flood > 3)
                return false;
        }
        else
            flood = 0;
        visited[row][col] = true;
        return traverse(row-1, col, flood) || traverse(row+1, col, flood) || traverse(row, col-1, flood) || traverse(row, col+1, flood);
    }
}
