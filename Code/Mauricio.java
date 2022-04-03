import java.io.File;
import java.util.Scanner;
/*
Mauricio
Question 9
UIL Invitational A 2020
 */
public class Mauricio {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("mauricio.dat"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            int max = ("" +(r * c)).length() + 1;
            int num = 1;
            if (r < c)
            {
                int row = 0;
                while (row < r)
                {
                    for (int j = 0; j < c; j++)
                    {
                        arr[row][j] = num++;
                    }
                    row++;
                    if (row == r)
                        break;
                    for (int j = c-1; j >= 0; j--)
                    {
                        arr[row][j] = num++;
                    }
                    row++;
                }
            }
            else if (c < r)
            {
                int col = 0;
                while (col < c)
                {
                    for (int j = 0; j < r; j++)
                    {
                        arr[j][col] = num++;
                    }
                    col++;
                    if (col == c)
                        break;
                    for (int j = r-1; j >= 0; j--)
                    {
                        arr[j][col] = num++;
                    }
                    col++;
                }
            }
            for (int rr = 0; rr < r; rr++)
            {
                for (int cc = 0; cc < c; cc++)
                {
                    System.out.printf("%" + max + "d",arr[rr][cc]);
                }
                System.out.println();
            }
            System.out.println("==========");
        }
    }
}
