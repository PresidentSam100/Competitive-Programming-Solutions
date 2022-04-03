import java.util.Arrays;
import java.util.Scanner;

public class Buses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] S = new int[m];
        int[] T = new int[m];
        for (int i = 0; i < m; i++)
        {
            int s = sc.nextInt();
            int t = sc.nextInt();
            S[i] = s;
            T[i] = t;
        }
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (i == 0)
                    dp[i] = 0;
                else if (S[j] == i)
                    dp[T[j]] = (dp[T[j]] + 1) % 1000000007;
                else if (T[j] == i)
                    dp[S[j]] = (dp[S[j]] + 1) % 1000000007;
                System.out.println(S[j] +  " " + i + " " + T[j]);

            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[n]);

    }
}
