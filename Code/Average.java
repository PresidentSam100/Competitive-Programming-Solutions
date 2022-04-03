import java.io.File;
import java.util.*;
// UIL State 2004
// Question 1
// Average Joe
public class Average {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("average.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int t = sc.nextInt();
            ArrayList <String> names = new ArrayList<>();
            ArrayList <Integer> scores = new ArrayList<>();
            ArrayList <Integer> total = new ArrayList<>();
            for (int y = 0; y < t; y++)
            {
                String name = sc.next();
                int score = sc.nextInt();
                boolean add = true;
                for (int i =0; i < names.size(); i++)
                {
                    if (name.compareTo(names.get(i)) < 0)
                    {
                        names.add(i, name);
                        total.add(i, 1);
                        scores.add(i, score);
                        add = false;
                        break;
                    }
                    if (name.compareTo(names.get(i)) == 0)
                    {
                        total.set(i, total.get(i) + 1);
                        scores.set(i, scores.get(i) + score);
                        add = false;
                        break;
                    }
                }
                if (add) {
                    names.add(name);
                    scores.add(score);
                    total.add(1);
                }
            }
            System.out.println(names.size() + " students");
            for (int i = 0; i < names.size(); i++)
            {
                double xx = scores.get(i) / total.get(i);
                System.out.print(names.get(i) + " ");
                if (xx >= 93)
                    System.out.println("A");
                else if (xx >= 83)
                    System.out.println("B");
                else if (xx >= 73)
                    System.out.println("C");
                else if (xx >= 60)
                    System.out.println("D");
                else if (xx >= 0)
                    System.out.println("F");
            }
        }
    }
}
