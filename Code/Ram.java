import java.io.File;
import java.util.Scanner;
/*
Ram
Question 10
UIL Invitational A 2020
*/
public class Ram {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("ram.dat"));
        while (sc.hasNextLine())
        {
            String z = sc.nextLine();
            String[] ss = z.split(" ");
            for (int i = 0; i < ss.length; i++)
            {
                String s = ss[i];
                String start = "";
                String end = "";
                if (!s.substring(0,1).matches("[a-zA-Z]"))
                {
                    start = s.substring(0,1);
                    s = s.substring(1);
                }
                if (!s.substring(s.length()-1).matches("[a-zA-Z]"))
                {
                    end = s.substring(s.length()-1);
                    s = s.substring(0,s.length()-1);
                }
                StringBuilder str = new StringBuilder(s);
                str = str.reverse();
                System.out.print(start + str.toString() + end + " ");
            }
            System.out.println();
        }
    }
}
