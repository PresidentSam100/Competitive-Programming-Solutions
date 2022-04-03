import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class Algorithms
{
    public static void knapSack(int W, int[] weights, int[] values, int n)
    {
        int[][] K = new int[n + 1][W + 1];

        // knapsack algorithm
        for (int i = 0; i <= n; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weights[i - 1] <= w)
                    K[i][w] = Math.max(values[i - 1] + K[i - 1][w - weights[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        // maximum value of knapsack
        int res = K[n][W];
        System.out.println(res);

        // items used in knapsack
        int w = W;
        for (int i = n; i > 0 && res > 0; i--)
        {
            // included
            if (res != K[i - 1][w])
            {
                System.out.println(weights[i - 1] + " " + values[i - 1]);
                // deductions
                res -= values[i - 1];
                w -= weights[i - 1];
            }
        }
    }

    public static void floodfill(int row, int col, String[][] maze, ArrayList<String> walls, int[][] steps, int step)
    {
        // Check for bounds
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[row].length)
            return;

        // Check if accessible and visited with less steps
        if (walls.contains(maze[row][col]) || step >= steps[row][col])
            return;

        // Update steps
        steps[row][col] = step++;

        // Traverse Up, Down, Left, and Right
        floodfill(row - 1, col, maze, walls, steps, step);
        floodfill(row + 1, col, maze, walls, steps, step);
        floodfill(row, col - 1, maze, walls, steps, step);
        floodfill(row, col + 1, maze, walls, steps, step);

        // Traverse Diagonally
        floodfill(row - 1, col - 1, maze, walls, steps, step);
        floodfill(row - 1, col + 1, maze, walls, steps, step);
        floodfill(row + 1, col - 1, maze, walls, steps, step);
        floodfill(row + 1, col + 1, maze, walls, steps, step);
    }

    public static double calculator(String expression)
    {
        // Parenthesis
        while (expression.contains("("))
        {
            int a = expression.lastIndexOf("(") + 1;
            int b = expression.indexOf(")", a);
            String c = expression.substring(a, b);
            expression = expression.substring(0, a - 1) + calculator(c) + expression.substring(b + 1);
        }

        String[] ss = expression.split(" ");
        ArrayList<String> s = new ArrayList<>(Arrays.asList(ss));

        // Functions
        for (int i = 0; i < s.size(); i++)
        {
            if (s.get(i).contains("log"))
                s.set(i, "" + Math.log10(Double.parseDouble(s.get(i).replaceAll("log",""))));
            else if (s.get(i).contains("asin"))
                s.set(i, "" + Math.asin(Double.parseDouble(s.get(i).replaceAll("asin",""))));
            else if (s.get(i).contains("acos"))
                s.set(i, "" + Math.acos(Double.parseDouble(s.get(i).replaceAll("acos",""))));
            else if (s.get(i).contains("atan"))
                s.set(i, "" + Math.atan(Double.parseDouble(s.get(i).replaceAll("atan",""))));
            else if (s.get(i).contains("sin"))
                s.set(i, "" + Math.sin(Double.parseDouble(s.get(i).replaceAll("sin",""))));
            else if (s.get(i).contains("cos"))
                s.set(i, "" + Math.cos(Double.parseDouble(s.get(i).replaceAll("cos",""))));
            else if (s.get(i).contains("tan"))
                s.set(i, "" + Math.tan(Double.parseDouble(s.get(i).replaceAll("tan",""))));
            else if (s.get(i).contains("sqrt"))
                s.set(i, "" + Math.sqrt(Double.parseDouble(s.get(i).replaceAll("sqrt",""))));
            else if (s.get(i).contains("cbrt"))
                s.set(i, "" + Math.cbrt(Double.parseDouble(s.get(i).replaceAll("cbrt",""))));
        }

        // Exponents
        while (s.contains("^"))
        {
            int a = s.indexOf("^");
            double y = Double.parseDouble(s.remove(a + 1));
            s.remove(a);
            double x = Double.parseDouble(s.remove(a - 1));
            s.add(a - 1, "" + Math.pow(x, y));
        }

        // Multiplication Division and Modulus
        while (s.contains("*") || s.contains("/") || s.contains("%"))
        {
            int a = s.contains("*")?s.indexOf("*"):s.size();
            int b = s.contains("/")?s.indexOf("/"):s.size();
            int c = s.contains("%")?s.indexOf("%"):s.size();
            if (a < b && a < c)
            {
                double y = Double.parseDouble(s.remove(a + 1));
                s.remove(a);
                double x = Double.parseDouble(s.remove(a - 1));
                s.add(a - 1, "" + (x * y));
            }
            else if (b < a && b < c)
            {
                double y = Double.parseDouble(s.remove(b + 1));
                s.remove(b);
                double x = Double.parseDouble(s.remove(b - 1));
                s.add(b - 1, "" + (x / y));
            }
            else if (c < a && c < b)
            {
                double y = Double.parseDouble(s.remove(c + 1));
                s.remove(c);
                double x = Double.parseDouble(s.remove(c - 1));
                s.add(c - 1, "" + (x % y));
            }
        }

        // Addition and Subtraction
        while (s.contains("+") || s.contains("-"))
        {
            int a = s.contains("+")?s.indexOf("+"):s.size();
            int b = s.contains("-")?s.indexOf("-"):s.size();
            if (a < b)
            {
                double y = Double.parseDouble(s.remove(a + 1));
                s.remove(a);
                double x = Double.parseDouble(s.remove(a - 1));
                s.add(a - 1, "" + (x + y));
            }
            else if (b < a)
            {
                double y = Double.parseDouble(s.remove(b + 1));
                s.remove(b);
                double x = Double.parseDouble(s.remove(b - 1));
                s.add(b - 1, "" + (x - y));
            }
        }
        return Double.parseDouble(s.get(0));
    }

    public static void dijkstra(int[][] graph, int start, int end, int n)
    {
        // distances between nodes
        for(int i = 0; i < n; i++)
        {
            for(int s = 0; s < n; s++)
            {
                for(int d = 0; d < n; d++)
                {
                    graph[s][d] = Math.min(graph[s][d],graph[s][i] + graph[i][d]);
                }
            }
        }

        int res = graph[start][end];
        System.out.println(res);
    }

    public static int windowsliding(int[] arr, int n, int k)
    {
        if (n < k)
            return -1;

        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        int window_sum = max_sum;
        for (int i = k; i < n; i++)
        {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }



    // Driver code
    public static void main(String[] args)
    {
        /*
        // Window Sliding
        int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(windowsliding(arr, n, k));
        */

        /*
        // Dijkstra's Algorithm
        int n = 10;
        int[][] graph = new int[n][n];

        // initialize graph distances
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(graph[i], Integer.MAX_VALUE/3);
            graph[i][i] = 0;
        }

        // graph connections
        for(int i = 0; i < n; i++)
        {
            int s = (int)(Math.random() * n);
            int d = (int)(Math.random() * n);
            if (s==d) continue;
            int w = (int)(Math.random() * n);
            graph[s][d] = graph[d][s] = w; // undirected weighted
            // graph[s][d] = w; // directed weighted graph
            // graph[s][d] = graph[d][s] = 1; // undirected unweighted graph
            // graph[s][d] = 1; // directed unweighted graph
        }
        int start = (int)(Math.random() * n);
        int end = (int)(Math.random() * n);

        dijkstra(graph, start, end, n);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.printf("%10d", graph[i][j]);
            }
            System.out.println();
        }
        */

        /*
        // Calculator

        for (int i = -10; i <= 10; i++)
        {
            String a = "7.2 * cos((x + 3) / 4)";
            a = a.replaceAll("x", ""+i);
            System.out.println(calculator(a));
        }
        for (int i = -10; i <= 10; i++)
        {
            String a = "log(x + 21) * 5.771";
            a = a.replaceAll("x", ""+i);
            System.out.println(calculator(a));
        }
        for (int i = -10; i <= 10; i++)
        {
            String a = "3 * x ^ 2 - 4 * x + 1";
            a = a.replaceAll("x", ""+i);
            System.out.println(calculator(a));
        }
        */

        /*
        // Floodfill

        String[][] maze = new String[10][10];
        ArrayList<String> walls = new ArrayList<>();
        int[][] steps = new int[10][10];

        for (int r = 0; r < 10; r++)
        {
            for (int c = 0; c < 10; c++)
            {
                maze[r][c] = "-";
                if (Math.random() > 0.9)
                    maze[r][c] = "W";
                steps[r][c] = maze.length * maze[0].length;
            }
        }
        walls.add("W");

        mazeTraverse(0, 0, maze, walls, steps, 0);
        System.out.println(Arrays.deepToString(steps));
        System.out.println(Arrays.deepToString(maze));
        */

        /*
        // Knapsack

        int []val = new int[10];
        int []wt = new int[10];
        for (int i = 0; i < 10; i++)
        {
            val[i] = (int)(Math.random() * 1000 + 1);
            wt[i] = (int)(Math.random() * 100 + 1);
        }

        int W = 100;
        int n = val.length;

        System.out.println("Values: " + Arrays.toString(val));
        System.out.println("Weights: " + Arrays.toString(wt));

        System.out.println("Max Weight: " + W);
        knapSack(W, wt, val, n);
        */

        // Arrays

        // Arithmetic Operators

        // ++ and --

        // Assignment Operators

        // Boolean Operators

        // Bitwise Operators

        // Branching

        // Looping

        // Print Statements
        double k = Math.PI;
        int l = Integer.MAX_VALUE;
        System.out.printf("%a\n%A\n%b\n%B\n%e\n%E\n%f\n%g\n%G\n%h\n%H\n%s\n%S\n", k, k, k, k, k, k, k, k, k, k, k, k, k);System.out.println();
        System.out.printf("%b\n%B\n%d\n%h\n%H\n%o\n%s\n%S\n%x\n%X\n", l, l, l, l, l, l, l, l, l, l);System.out.println();
        System.out.println("aa\bbb\fcc\ndd\ree\tff\'gg\"hh\\ii");System.out.println();
        // Parsing
        System.out.println(Arrays.toString("qwertyuiopasdfghjklzxcvbnm".split("[aeiou]",5)));System.out.println(); // limit is maximum number of elements
        System.out.println(Integer.parseUnsignedInt("34", 5)); // from base "radix" to base 10
        System.out.println(Integer.parseInt("-34", 5));
        System.out.println(Integer.toString(654, 5)); // from base 10 to base "radix"
        System.out.println(Integer.toUnsignedString(-654)); // negative value plus 2^32 (4294967296)
        System.out.println(Integer.toUnsignedString(-654, 5));
        System.out.println(Integer.toBinaryString(654));
        System.out.println(Integer.toOctalString(654));
        System.out.println(Integer.toHexString(654));
        System.out.println(Double.parseDouble("-324.1"));System.out.println();
        // Array and Collection Sort
        int[] arr = {7,6,5,4,3,2,1};
        Arrays.sort(arr, 1, 5); // "fromIndex" inclusive to "toIndex" exclusive
        System.out.println(Arrays.toString(arr));
        List <String> col = Arrays.asList("yes","i.e.","check","collection","??", "heave", "java");
        Collections.sort(col); // ascending order
        Collections.sort(col, Collections.reverseOrder()); // descending order
        Collections.sort(col, Comparator.comparing(String::length)); // ascending length
        System.out.println(col);

        for (int[] ints : ar) Arrays.fill(ints, -1);
        System.out.println(f(2015,2));
    }

    static int[][] ar = new int[2015][5];

    public static int f(int i, int j)
    {
        if (ar[i][j] != -1)
            return ar[i][j];
        else if (i == 0 && j >= 0 && j <= 4)
            return (j + 1) % 5;
        else if (i >= 1 && j == 0)
            return f(i - 1, j);
        else if (i >= 1 && j >= 1 && j <= 4)
            return f(i - 1, f(i, j - 1));
        return -1;
    }
}