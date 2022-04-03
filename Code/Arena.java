import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL Regional 2004
// Question 4
// Arena
public class Arena {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("arena.dat"));
        int N = sc.nextInt();
        for (int x = 0; x <N;x++)
        {
            int p1h = 5;
            int p2h = 5;
            ArrayList <Integer> p1a = new ArrayList<>();
            ArrayList <Integer> p1d = new ArrayList<>();
            ArrayList <Integer> p2a = new ArrayList<>();
            ArrayList <Integer> p2d = new ArrayList<>();
            for (int i = 0; i < 4; i++)
            {
                sc.nextLine();
                for (int j = 0; j < 5; j++)
                {
                    int w = sc.nextInt();
                    if (i == 0)
                        p1a.add(w);
                    else if (i == 1)
                        p1d.add(w);
                    else if (i == 2)
                        p2a.add(w);
                    else if (i == 3)
                        p2d.add(w);
                }
            }
            for (int i = 0; i < 5; i++)
            {
                if (!p1a.get(i).equals(p2d.get(i)))
                    p2h--;
                if (!p2a.get(i).equals(p1d.get(i)))
                    p1h--;
            }
            if (p1h > p2h)
                System.out.println("Fighter 1 is the victor!");
            else if (p1h < p2h)
                System.out.println("Fighter 2 is the victor!");
            else
                System.out.println("This battle ended in a draw!");
        }
    }
}
