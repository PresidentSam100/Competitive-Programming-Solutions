import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 7
// Fastest Mile
public class FastMile {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("fastmile.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            String s = sc.next();
            String [] sss = sc.nextLine().split("[\\W|\\D]");
            int mm = -1;
            int ss = -1;
            int hh = -1;
            int maxTime = -1;
            for (int i = 1; i < sss.length; i += 3)
            {
                if (maxTime == -1)
                {
                    mm = Integer.parseInt(sss[i]);
                    ss = Integer.parseInt(sss[i+1]);
                    hh = Integer.parseInt(sss[i+2]);
                    maxTime = Integer.parseInt(sss[i]) * 1000 + Integer.parseInt(sss[i+1]) * 10 + Integer.parseInt(sss[i+2]);
                }
                else
                {
                    int time = Integer.parseInt(sss[i]) * 1000 + Integer.parseInt(sss[i+1]) * 10 + Integer.parseInt(sss[i+2]);
                    if (maxTime > time)
                    {
                        mm = Integer.parseInt(sss[i]);
                        ss = Integer.parseInt(sss[i+1]);
                        hh = Integer.parseInt(sss[i+2]);
                        maxTime = Integer.parseInt(sss[i]) * 1000 + Integer.parseInt(sss[i+1]) * 10 + Integer.parseInt(sss[i+2]);
                    }
                }
            }
            System.out.printf(s + " " + mm + ":%02d.%02d\n",ss,hh);
        }
    }
}
