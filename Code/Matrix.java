import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// UIL Regional 2004
// Question 6
// Matrix
public class Matrix {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("matrix.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N ; x++)
        {
            int size = sc.nextInt();
            Set <Integer> data = new HashSet<>();
            int [][] matrix = new int[size][size];
            for (int i = 0; i < size * size; i++)
                data.add(i + 1);
            for (int r = 0; r < matrix.length; r++)
            {
                sc.nextLine();
                for (int c = 0; c < matrix[r].length; c++)
                {
                    Integer integer = sc.nextInt();
                    matrix[r][c] = integer;
                    data.remove(integer);
                }
            }
            boolean valid = true;
            int sum = 0;
            int tester = 0;
            for (int r = 0; r < matrix.length; r++)
            {
                sum = 0;
                for (int c = 0; c < matrix[r].length; c++)
                    sum += matrix[r][c];
                if (tester == 0)
                    tester = sum;
                if (sum != tester)
                    valid = false;
            }
            for (int r = 0; r < matrix.length; r++)
            {
                sum = 0;
                for (int c = 0; c < matrix[r].length; c++)
                    sum += matrix[c][r];
                if (sum != tester)
                    valid = false;
            }
            sum = 0;
            for (int r = 0; r < matrix.length; r++)
                sum += matrix[r][r];
            if (sum != tester)
                valid = false;
            sum = 0;
            for (int r = 0; r < matrix.length; r++)
                sum += matrix[r][matrix.length - r - 1];
            if (sum != tester)
                valid = false;
            if (data.size()==0 && valid)
                System.out.println("This magic square has sum = " + sum + ".");
            else
                System.out.println("This isn't a magic square.");
        }
    }
}