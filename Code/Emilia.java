import java.io.File;
import java.util.Scanner;
/*
Emilia
Question 3
UIL Invitational A 2020
*/
public class Emilia {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("emilia.dat"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            double hour = sc.nextDouble();
            double minute = sc.nextDouble();
            int h = (14 - (int)(hour / 30)) % 12;

            int m = (75 - (int)(minute / 6)) % 60;
            if (m==0) {
                h++;
                h%=12;
            }
            if (h==0)
                h=12;
            System.out.printf("%02d:%02d\n",h,m);
        }
    }
}