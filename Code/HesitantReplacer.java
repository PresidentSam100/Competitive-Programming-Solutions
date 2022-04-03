import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 23
// Hesitant Replacer
public class HesitantReplacer {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("hesitant.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0 ; x<N; x++)
        {
            int occurrences = sc.nextInt();
            int occur = 0;
            String find = sc.next();
            String replace = sc.next();
            sc.nextLine();
            String s = sc.nextLine();
            for (int i = 0; i <= s.length() - find.length(); i++)
            {
                String first = s.substring(0,i);
                String last = s.substring(i+find.length());
                if (s.substring(i,i+find.length()).equals(find))
                    occur++;
                if (occur == occurrences)
                {
                    occur=0;
                    s=first+replace+last;
                    i += replace.length()-1;
                }
            }
            System.out.println(s);
        }
    }
}
