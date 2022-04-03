import java.io.*;
import java.util.*;

public class Crossing {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("crossing.in"));
        int cases = in.nextInt();
        for(int tc = 0; tc < cases; tc++) {
            // initialize n and c
            int n = in.nextInt(); // number of items
            int c = in.nextInt(); // max weight

            int[] weights = new int[n]; // weights
            int[] expense = new int[n]; // expenses

            for(int i = 0; i < n; i++) {
                in.next();
                weights[i] = in.nextInt();
                expense[i] = in.nextInt();
            }

            // knapsack
            int[] dp = new int[c+1];
            for(int i = 1; i <= c; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if(i >= weights[j])
                    {
                        dp[i] = Math.max(dp[i], dp[i - weights[j]] + expense[j]);
                    }
                }
            }

            for (int r = 0; r < dp.length; r++)
            {
                System.out.printf("%5d",dp[r]);
            }
            System.out.println(dp[c]);
        }
    }
}