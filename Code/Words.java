import java.io.File;
import java.util.Scanner;
// UIL District1 2012
// Question 12
// Words with Friends
public class Words {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("words.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String [] s = sc.nextLine().split(" ");
            System.out.print(s[0]);
            for (int i = 1; i < s.length; i++)
                System.out.print(" " + s[i].substring(0,1));
            System.out.println();
        }
    }
}
