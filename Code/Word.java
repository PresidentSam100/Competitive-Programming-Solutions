import java.io.File;
import java.util.Scanner;
// UIL Regional 2005
// Question 10
// What's the Word?
public class Word {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("word.in"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[] sentence = sc.nextLine().split(" ");
            String first = sentence[0];
            String check = "";
            for (int i = 0; i < sentence.length; i++)
                check += sentence[i].substring(0,1);
            if (check.equalsIgnoreCase(first))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
