import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
// Tompkins Mock
// Question 6
// Four of a Kind
public class FourKind {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("fourkind.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            sc.nextLine();
            ArrayList<String> winner = new ArrayList<>();
            ArrayList<Integer> fours = new ArrayList<>();
            ArrayList <Integer> extras = new ArrayList<>();
            int fourType = -1;
            int extra = -1;
            for (int i = 0; i < 3; i++)
            {
                String name = sc.next();
                int check = 1;
                HashSet <Integer> four = new HashSet<>();
                for (int j = 0; j < 5; j ++)
                {
                    int c = sc.nextInt();
                    if (four.contains(c))
                    {
                        check++;
                        fourType = c;
                    }
                    four.add(c);
                }
                Iterator<Integer> it = four.iterator();
                while (it.hasNext())
                {
                    int xx  = it.next();
                    if (xx != fourType)
                        extras.add(extra);
                }
                if (check == 4 && four.size() == 2)
                {
                    winner.add(name);
                    fours.add(fourType);
                }
                if (!fours.isEmpty() && fours.get(0) < fourType)
                {
                    winner.remove(0);
                    fours.remove(0);
                }
                else if (!extras.isEmpty() && extras.get(0) < extra)
                {
                    extras.remove(0);
                    winner.remove(0);
                }
            }
            if (winner.isEmpty())
                System.out.print("NO WINNER");
            else if (winner.size() >= 2)
                System.out.print("TIE ");
            for (int i = 0; i < winner.size();i++)
                System.out.print(winner.get(i) + " ");
            System.out.println();
        }
    }
}
