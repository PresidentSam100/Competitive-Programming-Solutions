import java.io.File;
import java.util.Scanner;
// Clements Invitational
// Question 5
// Average Fun
public class AverageFun {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("averagefun.dat"));
        String[][] array = new String[5][5];
        int[][] average = new int[5][5];
        int[] rows = {1,0,-1,-1,-1,0,1,1};
        int[] cols = {1,1,1,0,-1,-1,-1,0};
        for (int i = 0; i < 5; i++)
        {
            String[]s = sc.nextLine().split(",");
            for (int c = 0; c < 5; c++)
                array[i][c] = s[c];
        }
        for (int r = 0; r < array.length; r++)
        {
            for (int c = 0; c < array[r].length; c++)
            {
                int hTotal = 1;
                int hAverage = Integer.parseInt(array[r][c].substring(0,1));
                int tTotal = 1;
                int tAverage = Integer.parseInt(array[r][c].substring(1,2));
                int uTotal = 1;
                int uAverage = Integer.parseInt(array[r][c].substring(2,3));
                for (int i =0; i < rows.length; i++)
                {
                    try
                    {
                        hAverage += Integer.parseInt(array[r+rows[i]][c+cols[i]].substring(0,1));
                        hTotal++;
                        if (i % 2 == 0)
                        {
                            tAverage += Integer.parseInt(array[r+rows[i]][c+cols[i]].substring(1,2));
                            tTotal++;
                        }
                        else
                        {
                            uAverage += Integer.parseInt(array[r+rows[i]][c+cols[i]].substring(2,3));
                            uTotal++;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException a)
                    {
                    }
                }
                hAverage /= hTotal;
                hAverage *= 100;
                tAverage /= tTotal;
                tAverage *= 10;
                uAverage /= uTotal;
                average[r][c] += hAverage + tAverage + uAverage;
            }
        }
        for (int r = 0; r < average.length; r++)
        {
            for (int c = 0; c < average[r].length; c++)
            {
                System.out.print(average[r][c]);
                if (c < average[r].length - 1)
                    System.out.print(",");
            }
            System.out.println();
        }
    }
}
