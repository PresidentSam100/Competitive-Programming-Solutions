import java.io.*;
import java.util.*;
public class Civilization {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("civilization.in"));
        int cases = in.nextInt();

        for(int tc = 0; tc < cases; tc++)
        {
            // initialize n, m, k, and e
            int n = in.nextInt(); // number of villages
            int m = in.nextInt(); // number of mcgee villages
            int k = in.nextInt(); // minimum distance
            int e = in.nextInt(); // number of connections

            int[] mcgee = new int[m];
            int[][] graph = new int[n][n];

            // initialize graph distances
            for(int i = 0; i < n; i++)
            {
                Arrays.fill(graph[i], Integer.MAX_VALUE/3);
                graph[i][i] = 0;
            }

            // mcgee villages
            for(int i = 0; i < m; i++)
                mcgee[i] = in.nextInt()-1;

            // graph connections
            for(int i = 0; i < e; i++)
            {
                int s = in.nextInt()-1;
                int d = in.nextInt()-1;
                int w = in.nextInt();
                graph[s][d] = graph[d][s] = w; // undirected weighted
                //graph[s][d] = w;
            }

            // distances between nodes
            for(int i = 0; i < n; i++) {
                for(int s = 0; s < n; s++) {
                    for(int d = 0; d < n; d++) {
                        graph[s][d] = Math.min(graph[s][d],graph[s][i] + graph[i][d]);
                    }
                }
            }

            // determine if good village
            for(int i = 0; i < n; i++) {
                boolean flag = false;
                for(int j = 0; j < m; j++) {
                    if(graph[i][mcgee[j]] <= k) {
                        System.out.printf("Village %d: All hail the holy city\n",i+1);
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                    System.out.printf("Village %d: Torch the village\n",i+1);
            }
            System.out.println();

            // print contents
            for(int i = 0; i < n; i++) {
                for(int j= 0; j < n; j++) {
                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}