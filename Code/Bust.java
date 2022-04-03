import java.io.File;
import java.util.Scanner;
// UIL State 2004
// Question 6
// Bust 'A Move
public class Bust {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("bust.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x <N; x++)
        {
            String[][] board = new String[5][10];
            for (int r = 0; r < board.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < board[r].length; c++)
                    board[r][c] = s.substring(c,c+1);
            }
            int groups = 0;
            for (int r = 0; r < board.length; r++)
            {
                for (int c = 0; c < board[r].length; c++)
                {
                    if (!board[r][c].equals("."))
                    {
                        pop(board, r, c, board[r][c]);
                        groups++;
                    }
                }
            }
            System.out.println(groups + " groups");
        }
    }

    public static void pop(String[][]board, int r, int c,String s)
    {
        if (r < 0 || c < 0 || r > board.length - 1 || c > board[r].length - 1)
            return;
        if (!board[r][c].equals(s))
            return;
        board[r][c] = ".";
        pop(board,r,c-1,s);
        pop(board,r,c+1,s);
        pop(board,r-1,c,s);
        pop(board,r+1,c,s);
    }
}
