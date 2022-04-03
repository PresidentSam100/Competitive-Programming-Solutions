import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 8
// Labyrinth
public class Labyrinth {
    private static String [][] first;
    private static String [][] second;
    private static String [][] third;
    private static int [][] moves;
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("labyrinth.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            first = new String[rows][columns];
            second = new String[rows][columns];
            third = new String[rows][columns];
            moves = new int[rows][columns];
            int startRow = -1;
            int startCol = -1;
            int endRow = -1;
            int endCol = -1;
            for (int r = 0; r < rows; r++) {
                String s = sc.next();
                for (int c = 0; c < columns; c++) {
                    moves[r][c] = rows * columns;
                    if (s.substring(c, c + 1).equals("#")) {
                        first[r][c] = "#";
                        second[r][c] = ".";
                        third[r][c] = ".";
                    } else if (s.substring(c, c + 1).equals(".")) {
                        first[r][c] = ".";
                        second[r][c] = "#";
                        third[r][c] = ".";
                    } else {
                        first[r][c] = s.substring(c, c + 1);
                        second[r][c] = s.substring(c, c + 1);
                        third[r][c] = s.substring(c, c + 1);
                    }
                    if (s.substring(c, c + 1).equals("S")) {
                        startRow = r;
                        startCol = c;
                    }
                    else if (s.substring(c, c + 1).equals("E")) {
                        endRow = r;
                        endCol = c;
                    }
                }
            }
            steps(startRow, startCol, 0, 0);


            if (moves[endRow][endCol] == rows * columns)
            {
                System.out.println("WELCOME TO THE BORG");
            }
            else
            {
                System.out.println("ESCAPED IN " + moves[endRow][endCol] + " STEPS");
            }
        }
    }

    public static void steps(int row, int col, int maze, int move)
    {
        if (row < 0 || col < 0 || row > first.length-1 || col > first[row].length-1)
            return;
        String[][] check = first;
        if (maze == 0)
            check = first;
        else if (maze == 1)
            check = second;
        else if (maze == 2)
            check = third;
        if (check[row][col].equals("#") || moves[row][col] < move)
            return;
        moves[row][col] = move;
        move++;
        maze++;
        maze %= 3;
        steps(row, col-1, maze, move);
        steps(row, col+1, maze, move);
        steps(row-1, col, maze, move);
        steps(row+1, col, maze, move);
    }
}
