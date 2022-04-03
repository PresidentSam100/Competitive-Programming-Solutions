import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 9
// Mining Away
public class MiningAway {
    static String[][] arr;
    static int[][] steps;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("mining.in"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            arr=new String[r][c];
            steps = new int[r][c];
            int startR = -1;
            int startC = -1;
            int endR = -1;
            int endC = -1;
            sc.nextLine();

            for (int rr = 0; rr < r; rr++)
            {
                String s = sc.nextLine();
                System.out.println(s);
                for (int cc = 0; cc < c; cc++)
                {
                    steps[rr][cc] = r*c;
                    arr[rr][cc] = s.substring(cc,cc+1);
                    if (s.substring(cc,cc+1).equals("S"))
                    {
                        startR = rr;
                        startC = cc;
                    }
                    if (s.substring(cc,cc+1).equals("E"))
                    {
                        endR = rr;
                        endC = cc;
                    }
                }
            }
            traverse(startR,startC,0);
            System.out.println(Arrays.deepToString(arr));
            if (steps[endR][endC] == r*c || steps[endR][endC] > 6 * m)
                System.out.println("Don't Mine At Night!");
            else
                System.out.println("Take Back The Night!");
        }
    }

    public static void traverse(int row, int col, int step)
    {
        if (row < 0 || col < 0 || row > arr.length-1 || col > arr[row].length-1)
            return;
        if (arr[row][col].equals("#")||  steps[row][col] < step)
            return;
        steps[row][col] = step++;
        traverse(row,col+1,step);
        traverse(row,col-1,step);
        traverse(row+1,col,step);
        traverse(row-1,col,step);
    }
}
