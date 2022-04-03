import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL State 2004
// Question 8
// Who's the Boss?
public class Boss {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("boss.dat"));
        ArrayList<ArrayList<String>> organizations = new ArrayList<>();
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            sc.nextLine();
            int M = sc.nextInt();
            String s = sc.next();
            ArrayList <String> organization = new ArrayList<>();
            organization.add(s);
            for (int y = 0; y < M; y++)
                organization.add(sc.next());
            organizations.add(organization);
        }
        int K = sc.nextInt();
        for (int z = 0; z < K; z++)
        {
            boolean work = false;
            String minion = sc.next();
            String test = minion;
            String boss = sc.next();
            int not = -1;
            for (int i = 0; i < organizations.size(); i++)
            {
                ArrayList<String> temp = organizations.get(i);
                if (temp.contains(test) && i != not)
                {
                    test = temp.get(0);
                    not = i;
                    i = -1;
                }
                if (test.equals(boss))
                {
                    work = true;
                    break;
                }
            }
            if (work)
                System.out.println(minion + ": Sure " + boss + ", I'll get right on it.");
            else
                System.out.println(minion + ": No " + boss + ", I don't have time to do your work and mine.");
        }
    }
}
