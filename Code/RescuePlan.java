import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Clements Invitational
// Question 10
// Rescue Plan
public class RescuePlan {
    static int[][][] steps;
    static ArrayList<String[][]> arr;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("rescueplan.dat"));
        arr=  new ArrayList<>();
        ArrayList<String> floor = new ArrayList<>();
        String bc = "";
        int row = 0;
        int col = 0;
        int startR = -1;
        int startC = -1;
        int startF = -1;
        int endR = -1;
        int endC = -1;
        int endF = -1;

        while (sc.hasNext())
        {
            String s = sc.nextLine();
            col = Math.max(col,s.length());
            if (s.contains("*"))
            {
                String[][] a = new String[row][col];
                for (int r = 0; r < row; r++)
                {
                    String ss = floor.get(r);
                    for (int c = 0; c < col; c++)
                    {
                        a[r][c] = ss.substring(c,c+1);
                        if (ss.substring(c,c+1).equals("E"))
                        {
                            startR = r;
                            startC = c;
                            startF = arr.size();
                        }
                        else if (ss.substring(c,c+1).equals("P"))
                        {
                            endR = r;
                            endC= c;
                            endF = arr.size();
                        }
                    }
                }
                arr.add(a);
                row = col = 0;
                floor = new ArrayList<>();
                continue;
            }
            floor.add(s);
            row++;
        }

        steps = new int[arr.size()][arr.get(0).length][arr.get(0)[0].length];
        int maxStep = steps.length * steps[0].length * steps[0][0].length;
        for (int[][] step : steps) {
            for (int[] ints : step) {
                Arrays.fill(ints, maxStep);
            }
        }

        traverse(startF, startR, startC, 0);

        int numSteps = steps[endF][endR][endC];
        String sol = "";
        while (numSteps > 0)
        {
            numSteps--;
            if (endF > 0 && steps[endF-1][endR][endC] == numSteps && arr.get(endF-1)[endR][endC].equals("S"))
            {
                endF--;
                sol = "D" + sol;
            }
            else if (endF < steps.length - 1 && steps[endF+1][endR][endC] == numSteps && arr.get(endF+1)[endR][endC].equals("S"))
            {
                endF++;
                sol = "U" + sol;
            }
            else if (endR > 0 && steps[endF][endR-1][endC] == numSteps)
            {
                endR--;
                sol = "S" + sol;
            }
            else if (endR < steps[endF].length - 1 && steps[endF][endR+1][endC] == numSteps)
            {
                endR++;
                sol = "N" + sol;
            }
            else if (endC > 0 && steps[endF][endR][endC-1] == numSteps)
            {
                endC--;
                sol = "E" + sol;
            }
            else if (endC < steps[endF][endR].length - 1 && steps[endF][endR][endC+1] == numSteps)
            {
                endC++;
                sol = "W" + sol;
            }
        }
        System.out.println(sol);

/*
        for (int f = 0; f < arr.size(); f++)
        {
            String[][] g = arr.get(f);
            for (int r = 0; r < g.length; r++)
            {
                for (int c = 0; c < g[r].length; c++)
                {
                    System.out.printf("%3s",g[r][c]);
                }
                System.out.println();
            }
            System.out.println(sol);
        }

        for (int f = 0; f < steps.length; f++)
        {
            for (int r = 0; r < steps[f].length; r++)
            {
                for (int c = 0; c < steps[f][r].length; c++)
                {
                    System.out.printf("%3d",steps[f][r][c]);
                }
                System.out.println();
            }
            System.out.println(sol);
        }

        System.out.println(startF + " " + startR + " " + startC);
        System.out.println(endF + " " + endR + " " + endC);


 */
    }

    public static void traverse(int floor, int row, int col, int step)
    {
        if (floor < 0 || row < 0 || col < 0 || floor > steps.length - 1 || row > steps[floor].length - 1 || col > steps[floor][row].length - 1)
            return;
        if (steps[floor][row][col] < step || arr.get(floor)[row][col].equals("W"))
            return;
        steps[floor][row][col] = step;
        step++;
        traverse(floor, row-1, col, step);
        traverse(floor, row+1, col, step);
        traverse(floor, row, col-1, step);
        traverse(floor, row, col+1, step);
        if (arr.get(floor)[row][col].equals("S"))
        {
            if (floor > 0 && arr.get(floor-1)[row][col].equals("S"))
                traverse(floor-1, row, col, step);
            if (floor < steps.length-1 && arr.get(floor+1)[row][col].equals("S"))
                traverse(floor+1, row, col, step);
        }
    }
}
