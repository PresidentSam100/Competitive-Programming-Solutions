import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Madye Creek Invitational
// Question 5
// Reverse
public class Reverse {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("reverse.dat"));
        while (sc.hasNext())
        {
            String [] s = sc.nextLine().split(" ");
            boolean [] flip = new boolean[s.length];
            ArrayList<String> reverse = new ArrayList<>();
            for (int i = 0; i < s.length; i++)
            {
                if ("aeiouAEIOU".contains(s[i].substring(0, 1)))
                {
                    flip[i] = true;
                    reverse.add(s[i]);
                }
            }
            Collections.reverse(reverse);
            for (int i = 0; i < s.length; i++)
            {
                if (flip[i])
                    s[i] = reverse.remove(0);
            }
            for (int i = 0; i < s.length; i++)
                System.out.print(s[i] + " ");
            System.out.println();
        }
    }
}
