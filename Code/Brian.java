import java.io.File;
import java.util.Scanner;
/*
Brian
Question 2
UIL Invitational A 2020
*/
public class Brian {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("brian.dat"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            System.out.println("In the year " + a + ", Brian will be coding in Java " + ((a-1995)/2)+ "!");
        }
    }
}
