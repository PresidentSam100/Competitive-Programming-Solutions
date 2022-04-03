import java.io.File;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 6
// Spiral
public class Spiral {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("spiral.dat"));
        int [] directions = {1,0,1,1,1,2,1,2};
        int [] moveR = {-1,0,1,1,1,0,-1,-1};
        int [] moveC = {1,1,1,0,-1,-1,-1,0};
        int direction = 0;
        int size = sc.nextInt();
        String [][] spiral = new String[size][size];
        int r = (spiral.length-1) / 2;
        int c = (spiral[r].length-1) / 2;
        while (r >= 0 && r < spiral.length && c >= 0 && c < spiral[r].length)
        {
            int move = directions[direction];
            for (int m = 0; m < move; m++)
            {
                spiral[r][c] = "*";
                r += moveR[direction];
                c += moveC[direction];
            }
            if (direction % 2 == 1)
                directions[direction] += 2;
            else
                directions[direction]++;
            direction = (direction + 1) % 8;
        }
        for (int row = 0; row < spiral.length; row++)
        {
            for (int col = 0; col < spiral[row].length; col++)
            {
                if (spiral[row][col] != null)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}