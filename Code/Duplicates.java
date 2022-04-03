import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 5
// Duplicate Vowels
public class Duplicates {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("duplicates.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N ; x++)
        {
            String s = sc.nextLine();
            String vowels = "AEIOU";
            int check = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (vowels.substring(check, check + 1).equals(s.substring(i, i+ 1)))
                    check++;
                if (check == 5)
                    break;
            }
            if (check == 5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
