import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 7
// Sketch-an-Etch
public class SketchAnEtch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("sketch.dat"));
        while (sc.hasNextLine())
        {
            int shape = sc.nextInt();
            int size = sc.nextInt();
            int ce = sc.nextInt();
            boolean fill = sc.nextBoolean();
            char [][] array = new char [size][size];
            char ch = ' ';
            if (ce == 0)
                ch = '!';
            else if (ce == 1)
                ch = '@';
            else if (ce == 2)
                ch = '#';
            else if (ce == 3)
                ch = '$';
            else if (ce == 4)
                ch = '%';
            else if (ce == 5)
                ch = '&';
            if (shape == 0)
            {
                for (int r = 0; r < array.length; r++)
                {
                    for (int c = 0; c < array[r].length; c++)
                    {
                        if (fill || r == 0 || c == 0 || r == array.length - 1 || c == array[r].length - 1)
                            array[r][c] = ch;
                    }
                }
            }
            else if (shape == 1)
            {
                for (int r = 0; r < array.length; r++)
                {
                    for (int c = array[r].length - r - 1; c >= 0; c--)
                    {
                        if (fill || r == 0 || c == 0 || r + c == array.length - 1)
                            array[r][c] = ch;
                    }
                }
            }
            else if (shape == 2)
            {
                for (int r = 0; r < array.length; r++)
                {
                    for (int c = r; c < array[r].length; c++)
                    {
                        if (fill || r == 0 || c == array[r].length - 1 || r == c)
                            array[r][c] = ch;
                    }
                }
            }
            else if (shape == 3)
            {
                for (int r = 0; r < array.length; r++)
                {
                    for (int c = 0; c < r + 1; c++)
                    {
                        if (fill || r == array.length - 1 || c == 0 || r == c)
                            array[r][c] = ch;
                    }
                }
            }
            else if (shape == 4)
            {
                for (int r = 0; r < array.length; r++)
                {
                    for (int c = array[r].length - 1; c >= 0; c--)
                    {
                        if (fill || r == array.length - 1 || c == array[r].length - 1 || r + c == array.length - 1)
                            array[r][c] = ch;
                    }
                }
            }
            for (int r = 0; r < array.length; r++)
            {
                String s = "";
                for (int c = 0; c < array[r].length; c++)
                    s += array[r][c];
                System.out.println(s);
            }
        }
    }
}