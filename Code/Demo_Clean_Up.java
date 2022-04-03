import java.io.File;
import java.util.*;
// Mayde Creek Invitational
// Question 7
// Demo Clean Up
public class Demo_Clean_Up {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("demo_clean_up.dat"));
        while (sc.hasNext())
        {
            String [] s = sc.nextLine().split(",");
            ArrayList <Integer> weights = new ArrayList<>();
            ArrayList <Integer> values = new ArrayList<>();
            int max = Integer.parseInt(s[0]);
            for (int i = 1; i < s.length; i++)
            {
                weights.add(Integer.parseInt(s[i]));
                values.add(Integer.parseInt(s[i]));
            }

            int res = 0;
            while (!weights.isEmpty())
            {
                knapSack(max, weights, values, values.size());
                res++;
            }
            System.out.println(res);
        }
    }

    public static void knapSack(int W, ArrayList<Integer> wt, ArrayList<Integer> val, int n)
    {
        double[][] K = new double[n + 1][W + 1];

        // knapsack algorithm
        for (int i = 0; i <= n; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt.get(i - 1) <= w)
                    K[i][w] = Math.max(val.get(i - 1) + K[i - 1][w - wt.get(i - 1)], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        // maximum value of knapsack
        double sol = K[n][W];

        // items used in knapsack
        int w = W;
        double res = sol;

        for (int i = n; i > 0 && res > 0; i--)
        {
            res = Double.parseDouble(String.format("%.2f", res));
            // not included
            if (res == K[i - 1][w])
                continue;
            else
            {
                // deductions
                res -= val.remove(i - 1);
                w -= wt.remove(i - 1);
            }
        }
    }
}