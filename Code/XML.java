import java.io.File;
import java.util.Scanner;
import java.util.Stack;
// Tompkins Mock
// Question 10
// XML Checker
public class XML {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("xml.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            Stack <String> html = new Stack<>();
            int att = sc.nextInt();
            for (int i = 0; i < att + 1; i++)
            {
                String s = sc.nextLine();
                if (s.length() != 0 && s.substring(0, 1).equals("<") && s.substring(s.length() - 1).equals(">"))
                    html.push(s);
                if (html.size() >= 2)
                {
                    String a = html.get(html.size() - 2).substring(1);
                    String b = html.get(html.size() - 1).substring(2);
                    if (a.equals(b))
                    {
                        html.pop();
                        html.pop();
                    }
                }
            }
            if (html.size() == 0)
                System.out.println("valid");
            else
                System.out.println("invalid");
        }
    }
}
