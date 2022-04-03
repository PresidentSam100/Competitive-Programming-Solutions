import java.io.File;
import java.util.Scanner;
// UIL State 2004
// Question 2
// Bowling For Dummies
public class Bowling {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("bowling.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[]s = sc.nextLine().split(" ");
            int total = 0;
            int frame = 1;
            int check = 0;
            for (int i = 0; i < s.length; i++)
            {
                if (s[i].equals("X"))
                {
                    total += 10;
                    if (frame != 10)
                    {
                        frame++;
                        if (s[i+1].equals("X"))
                            total+= 10;
                        else
                            total += Integer.parseInt(s[i+1]);
                        if (s[i+2].equals("X"))
                            total += 10;
                        else if (s[i+2].equals("/"))
                            total+=10 - Integer.parseInt(s[i+1]);
                        else
                            total += Integer.parseInt(s[i+2]);
                    }
                }
                else if (s[i].equals("/"))
                {
                    total += 10 - Integer.parseInt(s[i-1]);
                    if (frame != 10)
                    {
                        frame++;
                        check = 0;
                        if (s[i+1].equals("X"))
                            total+= 10;
                        else
                            total += Integer.parseInt(s[i+1]);
                    }
                }
                else
                {
                    total += Integer.parseInt(s[i]);
                    check++;
                    if (check == 2 && frame != 10)
                    {
                        check = 0;
                        frame++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
