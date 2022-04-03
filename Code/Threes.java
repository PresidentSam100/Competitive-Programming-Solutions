import java.io.File;
import java.util.Scanner;

public class Threes {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("threes.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int X = sc.nextInt();
            int temp = X;
            boolean three = false;
            while (!three)
            {
                temp++;
                if (temp % X == 0)
                {
                    three = true;
                    String s = Integer.toString(temp);
                    for (int i = 0; i < s.length(); i++)
                    {
                        if (!"03".contains(s.substring(i, i + 1))) {
                            three = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
