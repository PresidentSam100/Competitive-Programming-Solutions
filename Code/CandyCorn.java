import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CandyCorn {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("corn.dat"));
        int n = sc.nextInt();
        for (int i = 0; i <n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Integer> primefactorization = new ArrayList<>();
            ArrayList<Integer> factors = new ArrayList<>();
            int pf = y;
            int num = 2;
            while (pf != 1 && num <= pf) {
                if (pf % num == 0) {
                    pf /= num;
                    primefactorization.add(num);
                } else
                    num++;
            }
            int fac = 1;
            while (fac <= y)
            {
                if (y % fac ==0)
                    factors.add(fac);
                fac++;
            }

            System.out.println(primefactorization);
            System.out.println(factors);
            System.out.println();

            int[] maxLoop = new int[primefactorization.size()];
            int[] check = new int[maxLoop.length];
            int maxIndex = factors.size()-1;
            Arrays.fill(check,maxIndex);
            System.out.println(maxIndex);
            while (true)
            {
                Thread.sleep(1000);
                if (Arrays.equals(maxLoop,check))
                    break;
                maxLoop[0]++;
                for (int j = 0; j < maxLoop.length-1; j++)
                {
                    if (maxLoop[j] == maxIndex)
                    {
                        maxLoop[j+1]++;
                        maxLoop[j] = maxLoop[j+1];
                    }
                    else
                        break;
                }
                System.out.println(Arrays.toString(maxLoop));
            }
        }
    }
}
