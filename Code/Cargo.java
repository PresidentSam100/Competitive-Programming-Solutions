import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// Clements Invitational
// Question 9
// Cargo
public class Cargo {
    static int W = 100000;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("cargo.dat"));
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> tons = new ArrayList<>();
        ArrayList <Double> payments = new ArrayList<>();
        while (sc.hasNext())
        {
            String[] s = sc.nextLine().split("[-/]");
            String name = s[0];
            int ton = Integer.parseInt(s[1]);
            double payment = Double.parseDouble(s[2]);

            names.add(name);
            tons.add(ton);
            payments.add(payment);
        }

        printknapSack(tons, payments, names, tons.size());
    }

    public static void printknapSack(ArrayList<Integer> wt, ArrayList<Double> val, ArrayList<String> names, int n)
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
        ArrayList<String> included = new ArrayList<>();
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
                res -= val.get(i - 1);
                w -= wt.get(i - 1);
                included.add(names.get(i - 1));
            }
        }
        Collections.sort(included);
        for (int i = 0; i < included.size(); i++)
            System.out.println(included.get(i));
        System.out.printf("%d tons - $%.2f\n", W - w, sol);
    }
}
