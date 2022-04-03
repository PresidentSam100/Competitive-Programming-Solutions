import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Taylor Invitational
// Question 13
// Surfing The Web
public class SurfingTheWeb {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("surfing.dat"));
        ArrayList<String> history = new ArrayList<>();
        ArrayList<String> websites = new ArrayList<>();
        websites.add("Home");
        int current = 0;
        while (sc.hasNextLine())
        {
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("Goto"))
            {
                websites.remove(s[1]);
                websites.add(1, s[1]);
                history.remove(s[1]);
                history.add(0, s[1]);
                current = 1;
            }
            if (s[0].equals("Display"))
                System.out.println(websites.get(current));
            if (s[0].equals("Back"))
            {
                current++;
                if (current == websites.size())
                    current = websites.size() - 1;
            }
            if (s[0].equals("Forward"))
                current = 1;
            if (s[0].equals("Reset"))
            {
                websites.clear();
                websites.add("Home");
                current = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < history.size(); i++)
            System.out.println(history.get(i));
    }
}
